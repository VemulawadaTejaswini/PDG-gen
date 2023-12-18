import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    BigInteger dp[][];
    int ns[];
    int n;

    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ns = new int[n];
        for (int i = 0; i < n; i++) {
            ns[i] = sc.nextInt();
        }
        dp = new BigInteger[21][n];
        for (int i = 0; i < 21; i++)
            Arrays.fill(dp[i], BigInteger.ONE.negate());
        solve(0, 0);
        System.out.println(dp[0][0]);
    }

    BigInteger solve(int sum, int i) {
        BigInteger res = BigInteger.ZERO;
        if (sum > 20 || sum < 0)
            return BigInteger.ZERO;
        else if (dp[sum][i].compareTo(BigInteger.ZERO) >= 0) {
            return dp[sum][i];
        } else if (i == n - 1) {
            if (sum == ns[i]) {
                res = BigInteger.ONE;
            } else
                res = BigInteger.ZERO;
        } else {
            res = solve(sum + ns[i], i + 1).add(solve(sum - ns[i], i + 1));
        }
        return dp[sum][i] = res;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}