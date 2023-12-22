import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] cost = new int[n + 1][3], dp = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 3; j++)
                cost[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + cost[i][0];
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + cost[i][1];
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][0]) + cost[i][2];
        }

        System.out.println(Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]));
    }
}
