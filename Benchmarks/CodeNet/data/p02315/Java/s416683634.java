
import java.util.Scanner;

public class Main {

    int capacity;
    int n;
    int[] cost;
    int[] value;
    int[][] dp;
    Scanner in = new Scanner(System.in);

    boolean readCase() {
        while (in.hasNext()) {
            n = in.nextInt();
            capacity = in.nextInt();
            cost = new int[n];
            value = new int[n];
            for (int i = 0; i < n; i++) {
                value[i] = in.nextInt();
                cost[i] = in.nextInt();
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Main main = new Main();
        while (main.readCase()) {
            main.solve();
        }
    }

    void solve() {
        dp = new int[n + 1][];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = new int[capacity + 1];
            for (int j = 0; j < capacity + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(computeMemoization(0, capacity));
    }

    int computeMemoization(int itemIdx, int weight) {
        if (dp[itemIdx][weight] != -1) {
            return dp[itemIdx][weight];
        }
        int res;
        if (itemIdx == n) {
            res = 0;
        } else if (weight < cost[itemIdx]) {
            res = computeMemoization(itemIdx + 1, weight);
        } else {
            res = Math.max(computeMemoization(itemIdx + 1, weight),
                    computeMemoization(itemIdx + 1, weight - cost[itemIdx]) + value[itemIdx]);
        }
        dp[itemIdx][weight] = res;
        return res;
    }

}