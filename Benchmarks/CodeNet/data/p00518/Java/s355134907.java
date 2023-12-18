
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
		char[] c = scanner.next().toCharArray();
		num = new int[n];
		for (int i = 0; i < n; i++)
			if (c[i] == 'J')
				num[i] = 1;
			else if (c[i] == 'O')
				num[i] = 2;
			else
				num[i] = 4;
		dp = new int[8][n];
		for (int[] dp1 : dp)
			Arrays.fill(dp1, -1);
		System.out.println(slove(1, 0));
	}

	private int slove(int x, int day) {
		if (day == n)
			return 1;
		if (dp[x][day] != -1)
			return dp[x][day];
		int ans = 0;
		for (int i = 1; i < 8; i++) {
			if (((x & i) >= 1) && (i & num[day]) >= 1) {
				ans += slove(i, day + 1);
				ans %= mod;
			}
		}
		return dp[x][day] = ans % mod;
	}

	int n;
	int[] num;
	int[][] dp;
	int mod = 10007;
}