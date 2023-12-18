

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();

		if(s <= 2){
			System.out.println(0);
			return;
		}

		long result = 0;
		int mod = 1_000_000_007;
		long dp[] = new long[s + 1];
//		dp[0] = dp[1] = dp[2] = 1;
		for(int i = 3; i <= s; i++){
			dp[i] = 1;
			for(int j = 0; j <= i - 3; j++){
				dp[i] += dp[j];
				dp[i] %= mod;
			}
//			System.out.println("i = "+i+" "+dp[i]);
		}

		System.out.println(dp[s]);
	}
}

