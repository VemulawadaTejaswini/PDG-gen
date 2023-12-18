

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long [] height = new long[n + 1];


        long [] cost = new long[n + 1];
        height[0] = 0;
        for (int i = 1; i <= n; ++i) {
            height[i] = scanner.nextLong();
            cost[i] = Long.MAX_VALUE;
        }
        cost[0] = 0L;
        cost[1] = 0L;
        cost[2] = Math.abs(height[2] - height[1]);
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= k && i + j <= n; ++j) {
                cost[i + j] = Math.min(
                        cost[i + j],
                        cost[i] + Math.abs(height[i + j] - height[i])
                );
            }
        }
        System.out.println(cost[n]);

    }
}
