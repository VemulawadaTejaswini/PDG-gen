import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] wei = new int[n + 10];
		long[] val = new long[n + 10];
	    long[][] dp = new long[n + 10][w + 10];
		for(int i = 0 ; i < n ; i++) {
			wei[i] = sc.nextInt();
			val[i] = sc.nextLong();
		}
		for(int i = 0 ; i < n ; i++) {
			for(int sum_wei = 0 ; sum_wei <= w ; sum_wei++) {
				if(sum_wei - wei[i] >= 0) {
					dp[i + 1][sum_wei] = Math.max(dp[i + 1][sum_wei] , dp[i][sum_wei - wei[i]]) + val[i];  //選ぶ
				}
					dp[i + 1][sum_wei] = Math.max(dp[i + 1][sum_wei],dp[i][sum_wei]); //選んだ時 vs 選ばなかったとき
			}
		}

		sc.close();
		System.out.println(dp[n][w]);

	}

}

