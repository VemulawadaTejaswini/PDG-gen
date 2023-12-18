import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			final int MOD = 1000000007;
			int s = sc.nextInt();

			long[][] dp = new long[s / 3 + 1 + 1][s + 1];

			Arrays.fill(dp[0], 1);

			for (int i = 1; i < dp.length; i++) {
				for (int j = 3; j < dp[i].length; j++) {
					dp[i][j] = dp[i - 1][j - 3];

				}

				//累積和を取る
				long sum = 0;
				for (int j = 0; j < dp[i].length; j++) {
					sum = m_add(sum, dp[i][j], MOD);
					dp[i][j] = sum;
				}

			}

			long result = 0;
			for (int i = 0; i < dp.length; i++) {
				long diff = m_sub(dp[i][s], dp[i][s - 1], MOD);
				result = m_add(result, diff, MOD);
			}

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static long m_add(long a, long b, int MOD) {
		return ((a + b) % MOD);
	}

	public static long m_sub(long a, long b, int MOD) {
		long value = (a - b) % MOD;
		if (value < 0) {
			value += MOD;
		}
		return value;
	}

}