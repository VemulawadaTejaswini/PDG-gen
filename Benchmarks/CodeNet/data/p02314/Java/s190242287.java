
import java.util.Scanner;

public class Main {

    public static int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];

        for (int i = 1; i < dp.length; i++) {
            dp[i] = -1;
        }

        for (int coinsNum = 1; coinsNum <= coins.length; coinsNum++) {
            for (int amountN = amount; amountN >= 1; amountN--) {
                for (int takenNum = 1; takenNum * coins[coinsNum - 1] <= amountN; takenNum++) {
                    int prevTotal = dp[amountN - takenNum * coins[coinsNum - 1]];
                    if (prevTotal == -1) {
                        continue;
                    }
                    if (dp[amountN] == -1) {
                        dp[amountN] = prevTotal + takenNum;
                    } else {
                        dp[amountN] = Math.min(dp[amountN], prevTotal + takenNum);
                    }
                }
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int n = scanner.nextInt();
        int[] coins = new int[n];
        for (int i=0; i<n; i++) {
            coins[i] = scanner.nextInt();
        }
        System.out.println(coinChange(coins, amount));
    }
}