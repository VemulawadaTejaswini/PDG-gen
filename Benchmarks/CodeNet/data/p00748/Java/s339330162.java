

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int max = 1000000;
		int[] vals = new int[200];
		int maxN = 1;
		int val = 1;
		int maxValN = 0;

		ArrayList<Integer> arrayList = new ArrayList<>();
		int n;
		while ((n = s.nextInt()) != 0) {
			arrayList.add(n);
		}

		while (val < max) {
			vals[maxN] = val;
			if (val % 2 == 1) {
				maxValN = maxN;
			}
			maxN++;
			val = maxN * (maxN + 1) * (maxN + 2) / 6;
		}
		maxN--;

		int[] dp = new int[max];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = 1000000000;
		}
		dp[0] = 0;

		for (int i = 1; i <= maxN; i++) {
			for (int j = vals[i]; j < max; j++) {
				dp[j] = Math.min(dp[j], dp[j - vals[i]] + 1);
			}

		}
		int[][] b = new int[arrayList.size()][2];
		for (int i = 0; i < arrayList.size(); i++) {
			b[i][0] = dp[arrayList.get(i)];
		}
		for (int i = 0; i < dp.length; i++) {
			dp[i] = 1000000000;
		}
		dp[0] = 0;

		for (int i = 1; i <= maxN; i++) {
			if ((vals[i] % 2) != 1)
				continue;
			for (int j = vals[i]; j < max; j++) {
				dp[j] = Math.min(dp[j], dp[j - vals[i]] + 1);
			}

		}
		for (int i = 0; i < arrayList.size(); i++) {
			b[i][1] = dp[arrayList.get(i)];
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i][0] + " " + b[i][1]);
		}

	}
}