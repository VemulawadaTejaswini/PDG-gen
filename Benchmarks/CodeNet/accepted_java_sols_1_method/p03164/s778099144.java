import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int itemCount = scan.nextInt();
		int maxWait = scan.nextInt();

		int[][] itemArray = new int[itemCount + 1][2];

		for (int i = 1; i < itemCount + 1; i++) {

			// 重さ
			itemArray[i][0] = scan.nextInt();

			// 価値
			itemArray[i][1] = scan.nextInt();
		}

		// 個数 × 価値の合計
		long[][] dp = new long[itemCount + 1][100000 + 1];
		
		for(long[] array : dp) {

			Arrays.fill(array, Long.MAX_VALUE);
		}

		for (int i = 1; i < itemCount + 1; i++) {

			for (int v = 0; v < 100000 + 1; v++) {
				
				if (itemArray[i][1] >= v) {
					
					dp[i][v] = Math.min(
							itemArray[i][0],
							dp[i - 1][v]);
				} else {
					
					if (dp[i - 1][v - itemArray[i][1]] != Long.MAX_VALUE) {
						
						dp[i][v] = Math.min(
								dp[i - 1][v - itemArray[i][1]] + itemArray[i][0],
								dp[i - 1][v]);
					}
				}
				
				if (dp[i][v] != Long.MAX_VALUE && dp[i][v] > maxWait) {
					
					dp[i][v] = Long.MAX_VALUE;
				}
			}
		}
		
		for (int v = 100000; v >= 0; v--) {
			
			if (dp[itemCount][v] != Long.MAX_VALUE) {
				
				System.out.println(v);
				break;
			}
		}
	}
}
