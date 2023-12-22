// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // String S = sc.next();
        // long u = sc.nextLong();

        int D = sc.nextInt();
        int N = sc.nextInt();
        N = N == 100 ? 101 : N;
        int result = D == 0 ? N : (int)Math.pow(100, D) * N;

        System.out.println(result);
    }
}