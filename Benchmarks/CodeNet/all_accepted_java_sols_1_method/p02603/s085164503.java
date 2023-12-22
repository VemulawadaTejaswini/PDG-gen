import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long[][][] dp = new long[3][N+5][2];
        dp[0][0][0] = 1000;
        dp[0][0][1] = 0;
        dp[1][0][0] = 1000;
        dp[1][0][1] = 0;
        dp[2][0][0] = 1000;
        dp[2][0][1] = 0;
        for (int j = 1; j <= N; j++) {
            int price = A[j-1];
            for (int i = 0; i < 3; i++) {
                long maxValue = 0;
                for (int k = 0; k < 3; k++) {
                    long money  = dp[k][j-1][0];
                    long stock = dp[k][j-1][1];
                    if (i == 0) {
                        long buyNum = money/price;
                        money -= buyNum*price;
                        stock += buyNum;
                    } else if (i == 1) {
                        money += stock*price;
                        stock = 0;
                    } else {
                        // nop
                    }
                    long value = money + stock*price;
                    if (value >= maxValue) {
                        maxValue = value;
                        dp[i][j][0] = money;
                        dp[i][j][1] = stock;
                    }
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < 3; i++) {
            ans = Math.max(ans, dp[i][N][0]);
        }

        System.out.println(ans);
    }
}
