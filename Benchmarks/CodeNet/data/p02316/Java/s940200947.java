package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class KnapSackProblem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s = sc.nextInt();
		ArrayList <KnapSackItem> items = new ArrayList<KnapSackItem>();
		for (int i =0 ;i < n; i++) {
			items.add(new KnapSackItem(sc.nextInt(), sc.nextInt()));
		}
		
		int[][] dp = new int[s+1][n+1];
		for (int i = 0; i < n ; i++) {
			dp[0][i] = 0;
		}
		for (int i = 0; i <= s ; i++) {
			dp[i][0] = 0;
		}
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= s ; j++) {
				for (int k = 0; k <= j; k++) {
					dp[j][i] = Math.max(dp[j][i], dp[k][i-1] + (j-k)/items.get(i-1).size * items.get(i-1).value);
				}
			}
		}
		System.out.println(dp[s][n]);
	}
	private static class KnapSackItem{
		int size, value;
		public KnapSackItem (int v, int s) {
			size = s; 
			value = v;
		}
	}
}