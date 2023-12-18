
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int c = scanner.nextInt();
			if ((n | c) == 0)
				break;
			int[] a = new int[n];
			int[] b = new int[c];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < 16; j++)
					a[i] |= (scanner.nextInt() << j);
			for (int i = 0; i < c; i++)
				for (int j = 0; j < 16; j++)
					b[i] |= (scanner.nextInt() << j);
			int[][] dp = new int[n + 1][1 << 16];
			for (int i = 0; i <= n; i++)
				Arrays.fill(dp[i], -1);
			dp[0][0] = 0;
			for (int i = 0; i < n; i++) {
				for (int S = 0; S < 1 << 16; S++) {
					if (dp[i][S] == -1)
						continue;
					int light = S | a[i];
					for (int j = 0; j < c; j++) {
						int pushed = light & b[j];
						int point = Integer.bitCount(pushed);
						int nx = light & ~b[j];
						if (dp[i + 1][nx] < point + dp[i][S])
							dp[i + 1][nx] = point + dp[i][S];
					}
				}
			}
			int max = 0;
			for (int i = 0; i < 1 << 16; i++)
				max = Math.max(max, dp[n][i]);
			System.out.println(max);

		}
	}
}