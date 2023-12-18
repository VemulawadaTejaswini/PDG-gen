package com.twitter.ryutan.id0000;

import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Stream.iterate(1, i -> i + 1)
				.limit(9)
				.forEach(
						i -> Stream.iterate(1, j -> j + 1).limit(9)
								.forEach(j -> System.out.println(i + "x" + j + "=" + i * j)));
	}
}