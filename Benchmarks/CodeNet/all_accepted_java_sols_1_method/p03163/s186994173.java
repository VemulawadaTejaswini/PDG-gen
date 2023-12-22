import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        long[] v = new long[N];
        for (int i = 0 ; i < N ; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextLong();
        }
        long[][] dp = new long[N + 1][W + 1];
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j <= W ; j++) {
                dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
                if (j + w[i] <= W) {
                    dp[i + 1][j + w[i]] = Math.max(dp[i + 1][j + w[i]], dp[i][j] + v[i]);
                }
            }
        }
        System.out.println(dp[N][W]);
    }

}
