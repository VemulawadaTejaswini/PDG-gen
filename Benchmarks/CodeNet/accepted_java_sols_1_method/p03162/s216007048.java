import java.util.Scanner;

import static java.lang.Math.max;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] gain = new int[n][3];

        for (int i = 0; i < n; i++) {

            String[] abc = sc.nextLine().split(" ");
            gain[i][0] = Integer.parseInt(abc[0]);
            gain[i][1] = Integer.parseInt(abc[1]);
            gain[i][2] = Integer.parseInt(abc[2]);
        }

        // dp[i][j] := j - 1番目でiを選んだときの最適解
        int[][] dp = new int[n + 1][3];

        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = 0;

        for (int j = 1; j <= n; j++) {
            dp[j][0] = max(dp[j - 1][1], dp[j - 1][2]) + gain[j - 1][0];
            dp[j][1] = max(dp[j - 1][2], dp[j - 1][0]) + gain[j - 1][1];
            dp[j][2] = max(dp[j - 1][0], dp[j - 1][1]) + gain[j - 1][2];
        }

        System.out.println(max(max(dp[n][0], dp[n][1]), dp[n][2]));

    }
}