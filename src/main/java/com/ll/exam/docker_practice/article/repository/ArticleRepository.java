package com.ll.exam.docker_practice.article.repository;

import com.ll.exam.docker_practice.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}