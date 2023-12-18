import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		long[][] dp = new long[N + 1][W + 1];
		int[] wList = new int[N];
		long[] vList = new long[N];
		for (int i = 0; i < N; i++) {
			wList[i] = sc.nextInt();
			vList[i] = sc.nextInt();
		}
		for (int i = 0; i < W + 1; i++) {
			dp[0][i] = 0;
		}

		for (int i = 1; i < N + 1; i++) {
			for (int j = 0; j < W + 1; j++) {
				if (j - wList[i - 1] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wList[i - 1]] + vList[i - 1]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		System.out.println(dp[N][W]);
	}

}