
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int M = scanner.nextInt();
			int W = scanner.nextInt();
			if ((M | W) == 0)
				break;
			int[] bm = new int[M];
			for (int i = 0; i < M; i++)
				bm[i] = scanner.nextInt();
			int[] bw = new int[W];
			for (int i = 0; i < W; i++)
				bw[i] = scanner.nextInt();
			int[] dp = new int[1 << W];
				Arrays.fill(dp, -1);
			dp[0] = 0;
			for (int i = 0; i < M; i++) {
				for (int j = (1 << W) - 2; j >= 0; j--) {
					if (dp[j] == -1)
						continue;
					for (int k = 0; k < W; k++) {
						if (((j >> k) & 1) == 1)
							continue;
						int a = j | 1 << k;
						int b = (int) (Math.abs(bm[i] - bw[k]) * Math.pow(
								Math.abs(bm[i] - bw[k]) - 30, 2));
						dp[a] = Math.max(dp[a], dp[j] + b);
					}
				}
			}
			int max = 0;
			for (int i = 0; i < 1 << W; i++) {
				max = Math.max(max, dp[i]);
			}
			System.out.println(max);
		}
	}
}