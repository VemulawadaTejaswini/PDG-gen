import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] c = new int[m+1];
        for (int i = 1; i <= m; i++) {
            c[i] = sc.nextInt();
        }
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m+1; i++) {
            Arrays.fill(dp[i], n);
        }
        dp[0][0] = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = dp[i-1][j];
                if(j < c[i])continue;
                if(dp[i][j] > dp[i-1][j-c[i]] + 1) dp[i][j] = dp[i-1][j-c[i]] + 1;
                if(dp[i][j] > dp[i][j-c[i]] + 1) dp[i][j] = dp[i][j-c[i]] + 1;
            }
        }
        System.out.println(dp[m][n]);
        sc.close();

    }

}

