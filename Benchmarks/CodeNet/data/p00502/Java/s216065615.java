import java.util.Arrays;
import java.util.Scanner;

/**
 * Hot days
 * JOI 12th, Pre 4
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		String[] words;

		int D = sc.nextInt();
		int N = sc.nextInt();

		int[] T = new int[D];
		int[][] ABC = new int[N][3];
		int[][] CC = new int[N][N];

		for (int i = 0; i < D; i++) {
			T[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				ABC[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				CC[i][j] = Math.abs(ABC[i][2] - ABC[j][2]);
			}
		}

		//
		int[][] dp = new int[D][N];

		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}

		for (int i = 0; i < N; i++) {
			if (ABC[i][0] <= T[0] && T[0] <= ABC[i][1]) {
				dp[0][i] = 0;
			}
		}

		for (int i = 1; i < D; i++) {
			for (int j = 0; j < N; j++) {
				if (ABC[j][0] <= T[i] && T[i] <= ABC[j][1]) {
					for (int k = 0; k < N; k++) {
						if (dp[i - 1][k] != -1) {
							dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + CC[j][k]);
						}
					}
				}
			}
		}

		int max = -1;
		for (int i = 0; i < N; i++) {
			max = Math.max(max,dp[D-1][i]);
		}

		System.out.println(max);

	}
}