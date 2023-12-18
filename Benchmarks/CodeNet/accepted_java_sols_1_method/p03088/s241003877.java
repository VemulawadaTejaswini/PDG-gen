import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long mod = 1000000007;
		long[][][][] dp = new long[n + 1][4][4][4];//ACGT
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					dp[3][i][j][k] = 1;
				}
			}
		}
		dp[3][0][2][1] = 0;
		dp[3][0][1][2] = 0;
		dp[3][2][0][1] = 0;
		for (int i = 4; i <= n; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					for (int l = 0; l < 4; l++) {
						for (int m = 0; m < 4; m++) {
							//?021, ?201, ?012, 0?21, 02?1
							if (!(k == 0 && l == 2 && m == 1) && !(k == 2 && l == 0 && m == 1) && !(k == 0 && l == 1 && m == 2) && !(j == 0 && l == 2 && m == 1) && !(j == 0 && k == 2 && m == 1)) {
								dp[i][k][l][m] += dp[i - 1][j][k][l];
								dp[i][k][l][m] %= mod;
							}
						}
					}
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					ans += dp[n][i][j][k];
					ans %= mod;
				}
			}
		}
		System.out.println(ans);
	}
}