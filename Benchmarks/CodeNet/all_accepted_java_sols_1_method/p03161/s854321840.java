import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] h = new int[n];
			for(int i = 0 ; i < n ; i++) {
				h[i] = sc.nextInt();
			}
			int[] dp = new int[n];
			for(int i = 0 ; i < n ; i++) {
				if(i == 0) {
					dp[i] = 0;
				} else {
					int minCost = Integer.MAX_VALUE;
					int minCnt = Math.min(k, i);
					for(int j = 1 ; j <= minCnt ; j++) {
						int cost = dp[i - j] + Math.abs(h[i - j] - h[i]);
						minCost = Math.min(minCost, cost);
					}
					dp[i] = minCost;
				}
			}
			System.out.println(dp[n - 1]);

		}
	}
}
