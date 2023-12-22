import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int minCost(int[] h, int i, int[] dp, int k) {
        if (i == 0) {
            return 0;
        }

        int cost = Integer.MAX_VALUE;
        if (dp[i] == -1) {
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    cost = Integer.min(cost, minCost(h, i - j, dp, k) + Math.abs(h[i] - h[i - j]));
                }
            }
            dp[i] = cost;
        }
        return dp[i];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int size = scanner.nextInt();
            int k = scanner.nextInt();
            int[] h = new int[size];
            for (int i = 0; i < h.length; i++) {
                h[i] = scanner.nextInt();
            }
            int[] dp = new int[size];
            Arrays.fill(dp, -1);
            System.out.println(minCost(h, h.length - 1, dp, k));

        } finally {
            scanner.close();
        }
    }
}