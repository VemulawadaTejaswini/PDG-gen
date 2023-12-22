import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[][] abc = new int[N][3];
        for (int i = 0; i < N; i++) {
            abc[i][0] = Integer.parseInt(sc.next());
            abc[i][1] = Integer.parseInt(sc.next());
            abc[i][2] = Integer.parseInt(sc.next());
        }

        int[][] dp = new int[N][3];
        dp[0][0] = abc[0][0];
        dp[0][1] = abc[0][1];
        dp[0][2] = abc[0][2];

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j == k) {
                        continue;
                    }

                    int todayDP = dp[i][k];
                    int yesterday = dp[i - 1][j];
                    int today = abc[i][k];

                    dp[i][k] = Math.max(todayDP, yesterday + today);
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < 3; i++) {
            ans = Math.max(ans, dp[N - 1][i]);
        }

        System.out.println(ans);
    }
}

