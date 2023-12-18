import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int numOfCoin = sc.nextInt();
		int[] coins = new int[numOfCoin];
		for(int i = 0; i < numOfCoin; i++){
			coins[i] = sc.nextInt();
		}
		sc.close();
		int[][] dp = new int[numOfCoin + 1][amount + 1];
		Arrays.fill(dp[0], Integer.MAX_VALUE);
		for(int i = 1; i <= numOfCoin; i++){
			for(int j = 1; j <= amount; j++){
				int k = j - coins[i - 1];
				int num = Integer.MAX_VALUE;
				if(k >= 0){
					int num2 = Math.min(dp[i - 1][k], dp[i][k]);
					if(num2 < Integer.MAX_VALUE){
						num = num2 + 1;
					}
				}
				dp[i][j] = Math.min(num, dp[i - 1][j]);
			}
		}
		System.out.println(dp[numOfCoin][amount]);
	}

}