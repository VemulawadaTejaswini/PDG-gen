import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long w = sc.nextLong();

		long[] ws = new long[n];
		int[] vs = new int[n];
		int vSum = 1;

		for (int i = 0; i < n; i++) {
			ws[i] = sc.nextLong();
			vs[i] = sc.nextInt();
			vSum += vs[i];
		}
		long[][] dp = new long[n + 1][vSum];
		Arrays.fill(dp[0], 1_000_000_005);

		dp[0][0] = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < vSum; j++) {
				if (j < vs[i]) {
					dp[i + 1][j] = dp[i][j];
				} else {
					dp[i + 1][j] = Math.min(
							dp[i][j - vs[i]] + ws[i],
							dp[i][j]);
				}
			}
		}

		long answer = 0;
		for (int i = 0; i < vSum; i++) {
			if (dp[n][i] <= w) answer = Math.max(i, answer);
		}

		System.out.println(answer);
	}
}
