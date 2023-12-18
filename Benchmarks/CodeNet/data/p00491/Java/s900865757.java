
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		k = scanner.nextInt();
		plan = new int[n + 1];
		for (int i = 0; i < k; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			plan[a] = b;
		}
		dp = new int[n + 1][4][4];
		for (int i = 0; i <= n; i++)
			for (int j = 0; j < 4; j++)
				Arrays.fill(dp[i][j], -1);
		System.out.println(slove(1, 0, 0));
	}

	private int slove(int day, int pre1, int pre2) {
		if (day == n + 1)
			return 1;
		if (dp[day][pre1][pre2] != -1)
			return dp[day][pre1][pre2];
		if (plan[day] != 0)
			if (pre1 == pre2 && pre1 == plan[day])
				return 0;
			else
				return slove(day + 1, plan[day], pre1) % mod;
		int t = 0;
		for (int i = 1; i < 4; i++) {
			if (pre1 == pre2 && pre1 == i)
				continue;
			t += slove(day + 1, i, pre1) % mod;
		}
		return dp[day][pre1][pre2] = t % mod;

	}

	int n, k, d, s;
	int[] plan;
	int[][][] dp;
	int mod = 10000;
}