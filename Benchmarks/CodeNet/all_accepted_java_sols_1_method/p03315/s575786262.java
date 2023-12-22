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

        final String S = sc.next();
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            result += S.charAt(i) == '+' ? 1 : -1;
        }

        System.out.println(result);

    }
}