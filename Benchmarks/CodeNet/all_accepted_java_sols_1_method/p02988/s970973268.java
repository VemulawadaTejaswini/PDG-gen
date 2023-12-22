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

        long u = sc.nextLong();
        // long D = sc.nextLong();
        // long K = sc.nextLong();

        long[] p = new long[(int)u];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextLong();
        }

        int cnt = 0;
        for (int i = 1; i < p.length - 1; i++) {
            
            long[] tmp = Arrays.copyOfRange(p, i-1, i + 2);
            Arrays.sort(tmp);
            if(tmp[1] == p[i]) cnt++; 
        }

        System.out.println(cnt);
    }
}