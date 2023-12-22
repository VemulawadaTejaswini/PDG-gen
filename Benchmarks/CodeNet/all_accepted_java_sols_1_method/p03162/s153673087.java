import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] x = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[N][3];
        dp[0][0] = x[0][0];
        dp[0][1] = x[0][1];
        dp[0][2] = x[0][2];
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (k==j) continue;
                    dp[i+1][k] = Math.max(dp[i+1][k], dp[i][j] + x[i+1][k]);
                }
            }
        }
        int ans = 0;
        for(int k = 0; k < 3; k++) {
            ans = Math.max(ans, dp[N-1][k]);
        }
        System.out.println(ans);
    }
}