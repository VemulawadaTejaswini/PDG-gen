import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int C = sc.nextInt();
			if (C == 0) {
				sc.close();
				break;
			}

			int[] cycle = new int[C];
			for (int i = 0; i < C; i++) {
				cycle[i] = sc.nextInt();
			}

			int N = sc.nextInt();
			int[] meeting = new int[100];
			for (int i = 0; i < N; i++) {
				int day = sc.nextInt();
				meeting[day - 1] = sc.nextInt();
			}

			// dp[i日目に][サイクルjがきてる]ときのカフェイン最小回数
			int[][] dp = new int[100][C];
			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], 100);
			}
			dp[0][0] = 0;

			for (int i = 0; i < dp.length - 1; i++) {
				for (int j = 0; j < dp[i].length; j++) {
					// 間に合う時
					if (cycle[(j + 1) % C] <= meeting[i + 1] || meeting[i + 1] == 0) {
						dp[i + 1][(j + 1) % C] = Math.min(dp[i][j], dp[i + 1][(j + 1) % C]);
					}
					// カフェインを摂取する時
					dp[i + 1][0] = Math.min(dp[i][j] + 1, dp[i + 1][0]);
				}
			}

			int caffeine = Integer.MAX_VALUE;
			for (int i = 0; i < dp[99].length; i++) {
				caffeine = Math.min(caffeine, dp[99][i]);
			}
			System.out.println(caffeine);
		}
	}
}