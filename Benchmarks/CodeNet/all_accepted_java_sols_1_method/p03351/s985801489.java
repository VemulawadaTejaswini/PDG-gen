// package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();
        final int d = sc.nextInt();

        // d以内にabcがおさまっているか
        // a - b < d && b - c < dであればOK
        // a - c < dであればOK
        boolean canIndirectConnect = Math.abs(a - b) <= d && Math.abs(b - c) <= d;
        boolean canDirectConnect = Math.abs(a - c) <= d;

        System.out.println(canIndirectConnect || canDirectConnect ? "Yes" : "No");

    }
}