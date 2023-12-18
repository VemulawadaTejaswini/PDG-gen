// package app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // int K = sc.nextInt();

        // int[] a = new int[N];
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            // a[i] = sc.nextInt();
            // a.add(i);
            a.add(sc.nextInt() - 1);
        }

        boolean[] isTrace = new boolean[N];

        int currPos = 0;
        int cnt = 0;
        while(!isTrace[currPos]) {
            if (currPos == 1) break;
            isTrace[currPos] = true;
            currPos = a.get(currPos);
            cnt++;
        }

        System.out.println(currPos == 1 ? cnt : -1);

    }
}