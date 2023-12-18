import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n;
	int[] a;
	long[][] dp;

	long dp(int k, int sum) {
		if (sum < 0 || 20 < sum) {
			return 0;
		}
		if (k == 0) {
			if (a[k] == sum) return 1;
			return 0;
		}
		if (0 <= dp[k][sum]) {
			return dp[k][sum];
		}

		long res = 0;
		res += dp(k - 1, sum - a[k]);
		res += dp(k - 1, sum + a[k]);
		return dp[k][sum] = res;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		dp = new long[n][10*n + 5];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(dp(n - 2, a[n - 1]));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}