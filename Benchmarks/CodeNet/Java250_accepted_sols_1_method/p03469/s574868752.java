// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();
        // final int A = sc.nextInt();
        // final int A = sc.nextInt();
        // final int B = sc.nextInt();
        // final int C = sc.nextInt();

        // System.out.println();
        StringBuffer sb = new StringBuffer(S);
        sb.setCharAt(3, '8');
        System.out.println(sb.toString());

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}