import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int Ma = scan.nextInt();
        int Mb = scan.nextInt();
        int[] a = new int[N+1];
        int[] b = new int[N+1];
        int[] c = new int[N+1];
        for (int i = 1; i <= N; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
        }
        int[][][] dp = new int[N+1][N*10+1][N*10+1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N*10; j++) {
                for (int k = 0; k <= N*10; k++) {
                    dp[i][j][k] = Integer.MAX_VALUE;
                }
            }
        }
        dp[0][0][0] = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N*10; j++) {
                for (int k = 0; k <= N*10; k++) {
                    if (dp[i - 1][j][k] == Integer.MAX_VALUE) {
                        continue;
                    }
                    dp[i][j][k] = Math.min(dp[i][j][k], dp[i - 1][j][k]);
                    dp[i][j + a[i]][k + b[i]] = Math.min(dp[i][j + a[i]][k + b[i]], dp[i - 1][j][k] + c[i]);
                }
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= N*10; i++) {
            for (int j = 1; j <= N*10; j++) {
                if (dp[N][i][j] == Integer.MAX_VALUE) {
                    continue;
                }
                if (i * Mb == j * Ma) {
                    answer = Math.min(answer, dp[N][i][j]);
                }
            }
        }
        if (answer == Integer.MAX_VALUE) {
            answer = -1;
        }
        System.out.println(answer);
    }
}
