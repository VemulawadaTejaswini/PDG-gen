import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int s;
	long dp[][];

	void init() {
		n = sc.nextInt();
		s = sc.nextInt();
		dp = new long[n][101];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}
	}

	void run() {
		for (;;) {
			init();
			if ((n | s) == 0)
				break;
			long ans = 0;
			for (int i = 0; i < 101; i++)
				ans += solve(0, i, i);
			System.out.println(ans);
		}
	}

	long solve(int k, int m, int sum) {
		long res = 0;
		if (dp[k][m] >= 0) {

			return dp[k][m];
		}
		if (k == n - 1) {
			if (sum == s) {
				return 1;
			}
			return 0;
		}
		for (int i = m + 1; i < 101; i++) {
			if (sum + i > s)
				continue;
			res += solve(k + 1, i, sum + i);
		}

		return dp[k][m] = res;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}