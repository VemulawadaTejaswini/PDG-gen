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

        final int A = sc.nextInt();
        final int B = sc.nextInt();

        System.out.println(A <= 8 && B <= 8 ? "Yay!" : ":(");

    }
}