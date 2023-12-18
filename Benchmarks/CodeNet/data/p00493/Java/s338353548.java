
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextBigInteger().subtract(BigInteger.ONE).toString();
		String b = scanner.next();
		M = scanner.nextInt();
		System.out.println((slove(b) - slove(a) + mod) % mod);
	}

	private int slove(String s) {
		n = s.length();
		num = new int[n + 1];
		for (int i = 0; i < n; i++)
			num[i] = s.charAt(i) - '0';
		dp = new int[n][M][10][2][2];
		for (int[][][][] dp1 : dp)
			for (int[][][] dp2 : dp1)
				for (int[][] dp3 : dp2)
					for (int[] dp4 : dp3)
						Arrays.fill(dp4, -1);
		int res = 0;
		for (int i = 0; i < n; i++)
			for (int j = 1; j <= (i == 0 ? num[i] : 9); j++) {
				res = (res + slove(i, j % M, j, 1, i == 0 && j == num[i]))
						% mod;
				res = (res + slove(i, j % M, j, 0, i == 0 && j == num[i]))
						% mod;
			}

		return res % mod;
	}

	private int slove(int p, int m, int pre, int s, boolean b) {
		if (p == n - 1)
			return m == 0 ? 1 : 0;
		if (dp[p][m][pre][s][b ? 1 : 0] != -1)
			return dp[p][m][pre][s][b ? 1 : 0];
		int ans = 0;

		if (s == 0)
			for (int i = pre + 1; i <= (b ? num[p + 1] : 9); i++)
				ans += slove(p + 1, (m * 10 + i) % M, i, 1, b
						&& i == num[p + 1]);
		else
			for (int i = 0; i <= Math.min(b ? num[p + 1] : 9, pre - 1); i++)
				ans += slove(p + 1, (m * 10 + i) % M, i, 0, b
						&& i == num[p + 1]);
		return dp[p][m][pre][s][b ? 1 : 0] = ans % mod;
	}

	int M, n;
	int mod = 10000;
	int[] num;
	int[][][][][] dp;
}