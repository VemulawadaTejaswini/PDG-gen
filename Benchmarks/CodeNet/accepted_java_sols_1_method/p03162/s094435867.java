import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[][] dp = new long[n][3];
        int[][] happy = new int[n][3];

        long INF = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                happy[i][j] = sc.nextInt();
            }
        }

        sc.close();

        dp[0][0] = happy[0][0];
        dp[0][1] = happy[0][1];
        dp[0][2] = happy[0][2];

        for (int i = 1; i < n; i++) {
            dp[i][0] = happy[i][0] + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = happy[i][1] + Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = happy[i][2] + Math.max(dp[i - 1][0], dp[i - 1][1]);
        }

        long ans = Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));

        System.out.println(ans);
    }

}