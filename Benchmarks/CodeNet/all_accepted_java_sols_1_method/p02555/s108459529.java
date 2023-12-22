//package abc178;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		
		if(S < 3) {
			System.out.println(0);
			return;
		}
		
		int mod = (int)1e9+7;
		
		int[] dp = new int[S+1];
		
		dp[0] = dp[1] = dp[2] = 0;
		dp[3] = 1;
		
		
		for(int i = 4 ; i <= S ; i++) {
			dp[i] = 1;
			
			for(int j = 3 ; j <= i ; j++) {
				dp[i] = (dp[i]%mod +  dp[i-j]%mod)%mod;
			}
		}
		
		System.out.println(dp[S]);
	}
}
