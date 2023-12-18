import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int W = input.nextInt();
		long[][] dp = new long[N+1][W+1];
		int[][] items = new int[N][2]; //(weight,value)
		for (int i = 0; i < N; i++) {
			items[i][0] = input.nextInt();
			items[i][1] = input.nextInt();
		}
		int STARTWEIGHT = items[0][0];
		for (int i = STARTWEIGHT; i <= W; i++) {
			dp[1][i] = items[0][1];
		}
		for (int item = 2; item <= N; item++) {
			for (int weight = 1; weight <= W; weight++) {
				int curW = items[item-1][0]; //Current weight
				int curV = items[item-1][1]; //Current value
				dp[item][weight]=dp[item-1][weight];
				if (weight>=curW) {
					dp[item][weight]=Math.max(dp[item][weight], curV);
					dp[item][weight]=Math.max(dp[item-1][weight-curW]+curV, dp[item][weight]);
				} 
			}
		} 
		/*for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= W; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.print("\n");
		}*/
		System.out.println(dp[N][W]);
	}
}