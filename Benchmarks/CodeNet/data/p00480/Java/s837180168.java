import java.util.Arrays;
import java.util.Scanner;

public class Main {
    long dp[][];
    long INF = Long.MAX_VALUE;
    int ns[];
    int n;

    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ns = new int[n];
        for (int i = 0; i < n; i++) {
            ns[i] = sc.nextInt();
        }
        dp = new long[21][n];
        for (int i = 0; i < 21; i++)
            Arrays.fill(dp[i], -1);
        solve(0, 0);
        System.out.println(dp[0][0]);
    }

    long solve(int sum, int i) {
        long res = 0;
        if (sum > 20 || sum < 0)
            return 0;
        else if (dp[sum][i] >= 0) {
            return dp[sum][i];
        } else if (i == n - 1) {
            if (sum == ns[i]) {
                res = 1;
            } else
                res = 0;
        } else {
            res = solve(sum + ns[i], i + 1) + solve(sum - ns[i], i + 1);
        }
        return dp[sum][i] = res;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}