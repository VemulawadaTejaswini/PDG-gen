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
        int K = sc.nextInt();


        // N個のボールをK種類の色で塗る場合、塗り方のが何通りあるか求める。
        // N: 2, K: 2の場合
        // ab,baの2通り
        // N: 2, K: 3の場合
        // ab, ba, ac, ca, bc, cbの6通りがある
        // N: 2, K: 4の場合
        // ab, ba, ac, ca, bc, cb, ad, bd, cd, da, db, dcの12通り

        // N:3, K:2の場合
        // aba, babの2通り
        // N:4, K:2の場合
        // abab, babaの2通り

        // N:3, K:3の場合
        // aba, aca, abc, acb, bab, bcb, bac, bca, cac, cbc, cab, cbaの12通り
        // N:3, K:4の場合
        // aba, aca, ada, abc, abd, acb, acd, adb, adc
        // bab, bcb, bdb, bac, bad, bca, bcd, bda, bdc


        // 数式 num = K * (K - 1) ^ (N - 1)
        long result = (long)(K * Math.pow((K - 1), (N - 1)));

        System.out.println(result);
    }
}