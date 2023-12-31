package com.joeun.board.service;

import java.util.List;

import com.joeun.board.dto.Board;
import com.joeun.board.dto.Page;

public interface BoardService {

    // 게시글 목록
    public List<Board> list() throws Exception;
    // 게시글 조회
    public Board select(int boardNo) throws Exception;
    // 게시글 등록
    public int insert(Board board) throws Exception;
    // 게시글 수정
    public int update(Board board) throws Exception;
    // 게시글 삭제
    public int delete(int boardNo) throws Exception;

    // 게시글 목록(페이징 처리)
    public List<Board> list(Page page) throws Exception;

    // 게시글 총 개수
    public int countTotalPosts() throws Exception;

    // 좋아요 수 증가
    public int increaseLikeCount(int boardNo) throws Exception;

    // 좋아요 수 조회
    public int selectLikeCount(int boardNo) throws Exception;
    
}
 