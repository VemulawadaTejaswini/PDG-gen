import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int w[] = new int[n + 1];
        int v[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long dp[][] = new long[n + 1][W + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                long tmp = 0;
                if (w[i] > j) {
                    tmp = dp[i - 1][j];
                } else {
                    if ((j - w[i]) < W + 1) {
                        // System.out.println(j - w[i]);
                        long before = dp[i - 1][j - w[i]];
                        tmp = before + v[i];
                    } else {
                        tmp = dp[i - 1][j];
                    }
                }
                dp[i][j] = Math.max(tmp, dp[i - 1][j]);
            }
        }
        long ans = 0;
        for (long i : dp[n]) {
            if (ans < i) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}