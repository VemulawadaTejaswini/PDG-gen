

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String S = sc.next();
            // 累積和つくる
            int[] bSum = new int[N + 1];
            int[] wSum = new int[N + 1];
            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                bSum[i + 1] = bSum[i] + (c == '#' ? 1 : 0);
                wSum[i + 1] = wSum[i] + (c == '.' ? 1 : 0);
            }
            // 各位置における（左の黒の数＋右の白の数）を求めて、そのうち一番小さいものを採用する
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= N; i++) {
                int leftB = bSum[i];
                int rightW = wSum[N] - wSum[i];
                min = Math.min(min, leftB + rightW);
            }
            System.out.println(min);
        }
    }

}
