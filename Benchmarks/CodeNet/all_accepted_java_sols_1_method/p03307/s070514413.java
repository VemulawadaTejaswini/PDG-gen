// package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // フィールド
    static char[][] field;
    // 最小反転回数
    static int retMinCnt = Integer.MAX_VALUE;

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        System.out.println(N % 2 == 0 ? N : N * 2);

    }
}