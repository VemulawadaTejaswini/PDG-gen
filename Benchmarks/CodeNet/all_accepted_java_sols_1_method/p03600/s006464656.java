
import java.util.Scanner;

public class Main {
    static long [][] map;
    static long [][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new long[n][n];
        dp = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d = sc.nextInt();
                map[i][j] = d;
                dp[i][j] = d;
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(dp[i][j] >= dp[i][k] + dp[k][j] && i != k && j != k) {
                        if(dp[i][j] > dp[i][k] + dp[k][j] ) {
                            System.out.println(-1);
                            return;
                        }
                        dp[i][j] = dp[i][k] + dp[k][j];
                        map[i][j] = 0;
                    }
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long d = map[i][j];
                if(d == dp[i][j]) {
                    sum += d;
                }
            }
        }

        System.out.println(sum/2);
    }

}

