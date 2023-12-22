import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] happy = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < 3; k++) {
                happy[i][k] = sc.nextInt();
            }
        }

        int[][] dp = new int[N + 1][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j == k) continue;
                    dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][k] + happy[i][j]);
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 3; i++) {
            result = Math.max(result, dp[N][i]);
        }

        System.out.println(result);
    }
}
