

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		HashMap<Integer, Integer> vals = new HashMap<>();
		int maxN = 1;
		int val = 1;
		int maxValN = 0;
		while (val < 1000000) {
			vals.put(maxN, val);
			if (val % 2 == 1) {
				maxValN = maxN;
			}
			maxN++;

			val = maxN * (maxN + 1) * (maxN + 2) / 6;

		}
		maxN--;

		int[][] dp = new int[maxN + 1][1000000];
		int[][] dp1 = new int[maxN + 1][1000000];

		for (int[] is : dp) {
			Arrays.fill(is, 100);
		}

		for (int[] is : dp1) {
			Arrays.fill(is, 100);
		}
		int temp = 1;
		for (int i = 1; i <= maxN; i++) {
			int minVal = vals.get(i);
			for (int j = 0; j < 1000000; j++) {
				if (i == 1) {
					dp[i][j] = j;
					dp1[i][j] = j;

				} else if (i > 1 && j - minVal >= 0) {
					if (minVal % 2 == 1) {
						dp1[i][j] = Math.min(dp1[temp][j], dp1[i][j - minVal] + 1);
					}
					dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - minVal] + 1);
				} else {
					if (minVal % 2 == 1) {
						dp1[i][j] = dp1[temp][j];
					}
					dp[i][j] = dp[i - 1][j];
				}
			}
			if (minVal % 2 == 1) {
				temp = i;
			}

		}

		int n;
		while ((n = s.nextInt()) != 0) {
			System.out.print(dp[maxN][n] + " ");
			System.out.println(dp1[maxValN][n]);
		}

	}
}