import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MAX_V = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long w = sc.nextLong();
        long[] W = new long[n + 10];
        int[] V = new int[n + 10];
        for(int i = 0; i < n; i++) {
            W[i] = Integer.parseInt(sc.next());
            V[i] = Integer.parseInt(sc.next());
        }
        long[][] dp = new long[n + 10][n * MAX_V + 10];
        for(long[] r : dp) Arrays.fill(r, Integer.MAX_VALUE);
        dp[0][0] = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= n * MAX_V; j++) {
                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
                if(j - V[i] >= 0) {
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j - V[i]] + W[i]);
                }
            }
        }
        long ans = 0;
        for(int i = 0; i < n * MAX_V + 10; i++) {
            if(dp[n][i] <= w) ans = i;
        }
        System.out.println(ans);
    }
}