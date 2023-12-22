// package app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String S = sc.next();

        final int N = sc.nextInt();
        final int A = sc.nextInt();
        // final long B = sc.nextLong();
        // final String s = sc.next();
        // final String b = sc.next();

        int oddNum = 0;
        int evenNum = 0;
        for (int i = N - 1; i > 0; i--) {
            oddNum += i;
        }
        for (int i = A - 1; i > 0; i--) {
            evenNum += i;
        }
        System.out.println(oddNum + evenNum);

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}