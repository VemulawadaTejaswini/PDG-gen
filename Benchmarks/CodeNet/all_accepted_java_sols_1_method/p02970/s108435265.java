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

        // long N = sc.nextLong();
        // long K = sc.nextLong();
        int N = sc.nextInt();
        int D = sc.nextInt();

        int tmp = ((D * 2) + 1);
        System.out.println(N % tmp != 0 ? N / tmp + 1 : N / tmp);
    }
}