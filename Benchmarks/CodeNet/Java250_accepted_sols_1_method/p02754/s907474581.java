// package app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String s = sc.next();
        final long N = sc.nextLong();
        final long A = sc.nextLong();
        final long B = sc.nextLong();
        // final String s = sc.next();
        // final String b = sc.next();

        // final int b = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();

        long result = 0;
        if(A == 0) {
            result = 0;
        } else if (B == 0) {
            result = N;
        }else {
            long sum = N / (A + B);
            long remain = N % (A + B);
            result = sum * A;
            result += remain >= A ? A : remain;
        }

        System.out.println(result);

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}