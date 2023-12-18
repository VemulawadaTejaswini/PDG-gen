
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
			int[][] dp = new int[2][1 << 16];
			Arrays.fill(dp[0], -1);
			dp[0][0] = 0;
			int X = 1;
			for (int i = 0; i < n; i++, X = 1 - X) {
				for (int S = 0; S < 1 << 16; S++) {
					if (dp[1 - X][S] == -1)
						continue;
					int light = S | a[i];
					for (int j = 0; j < c; j++) {
						int pushed = light & b[j];
						int point = Integer.bitCount(pushed);
						int nx = light & ~b[j];
						if (dp[X][nx] < point + dp[1 - X][S])
							dp[X][nx] = point + dp[1 - X][S];
					}
				}
			}
			int max = 0;
			for (int i = 0; i < 1 << 16; i++)
				max = Math.max(max, dp[1 - X][i]);
			System.out.println(max);

		}
	}
}