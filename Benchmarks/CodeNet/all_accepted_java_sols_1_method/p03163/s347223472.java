import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        long[] v = new long[N];
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextLong();
        }

        long[][] dp = new long[N + 1][W + 1];
        for (int i = 0; i < N; i++) {
            for (int sumw = 0; sumw <= W; sumw++) {
                if (sumw >= w[i]) {
                    dp[i + 1][sumw] = dp[i][sumw - w[i]] + v[i];
                }
                dp[i + 1][sumw] = Math.max(dp[i + 1][sumw], dp[i][sumw]);
            }
        }
        System.out.println(dp[N][W]);
    }

}
