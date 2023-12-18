import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static long M = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// A G C T
		// 0 1 2 3

		// A -> G

		long[][][][] dp = new long[4][4][4][n - 3 + 1];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					Arrays.fill(dp[i][j][k], 0L);
					dp[i][j][k][0] = 1L;
				}
			}
		}

		dp[0][1][2][0] = 0L; // AGC:A
		dp[0][2][1][0] = 0L; // ACG:A
		dp[1][0][2][0] = 0L; // GAC:A


		for (int m = 0; m < n - 3; m++) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						for (int l = 0; l < 4; l++) {
							dp[j][k][l][m + 1] = (dp[j][k][l][m + 1] + dp[i][j][k][m]) % M;

							dp[0][1][2][m + 1] = 0L;
							dp[0][2][1][m + 1] = 0L;
							dp[1][0][2][m + 1] = 0L;

							if (i == 0) {
								for (int o = 0; o < 4; o++) {
									dp[o][1][2][m + 1] = 0L;
									dp[1][o][2][m + 1] = 0L;
								}
							}
						}
					}
				}
			}
		}

		long answer = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					answer = (answer + dp[i][j][k][n - 3]) % M;
				}
			}
		}
		System.out.println(answer);

	}
}
