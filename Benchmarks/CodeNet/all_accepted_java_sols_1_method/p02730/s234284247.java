// package app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        // final int N = sc.nextInt();
        // final int A = sc.nextInt();
        // final long B = sc.nextLong();
        // final String s = sc.next();
        // final String b = sc.next();

        // 条件
        // 1. Sは回文
        // 2. 1文字目から( N-1 )/2文字までが回文になる(N = 7の場合: 1文字目から3文字目が回文)
        // 3. ( N+3 ) / 2文字目からN文字目までが回文
        // -----
        // akasakaの場合
        // 1.の回文はパスしている
        // 2.の1文字目から(7 - 1) / 2 ＝＞ 3文字目までは akaなのでパス
        // 3.の(7+3) / 2 => 5文字目から7文字目まではakaなのでおｋ

        boolean result = true;

        // 1.回文チェック
        StringBuffer sb = new StringBuffer(S);
        if (!sb.reverse().toString().equals(S)) {
            result = false;
        }
        // 2. 1文字目から(N-1) / 2文字目までが回文チェック
        String startHalfStr = S.substring(0, (S.length() - 1) / 2);
        sb.setLength(0);
        sb.append(startHalfStr);
        if (!sb.reverse().toString().equals(startHalfStr)) {
            result = false;
        }
        sb.setLength(0);
        String endHalfStr = S.substring((S.length() + 3) / 2 - 1, S.length());
        sb.append(endHalfStr);
        if (!sb.reverse().toString().equals(endHalfStr)) {
            result = false;
        }

        System.out.println(result ? "Yes" : "No");

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}