import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long sum;
	static int dp[];

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		dp = new int[31];
		Arrays.fill(dp, -1);
		dp[0] = 1;
		solve(30);
		// System.out.println(Arrays.toString(dp));
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			System.out.println((dp[n] / 10 + 1) / 365 + 1);
		}
	}

	public static int solve(int n) {
		int res = 0;
		if (dp[n] != -1) {
			res = dp[n];
		} else {
			for (int i = 1; i <= 3; i++) {
				if (n - i >= 0)
					res += solve(n - i);
			}
		}
		return dp[n] = res;
	}
}