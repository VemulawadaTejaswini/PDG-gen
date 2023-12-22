import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static long rec(int i,long[]dp,long[] h) {
		
		//DPの値が更新されていたら、そのままリターン
		if(dp[i] < Long.MAX_VALUE) {
			return dp[i];
		}
		
		if(i == 0) {
			return 0;
		}
		
		// i-1,i-2 それぞれ試す
		long res = Long.MAX_VALUE;
		
		res = Math.min(rec(i-1,dp,h)+Math.abs(h[i]-h[i-1]),res);
		if(i>1) res = Math.min(rec(i-2,dp,h)+Math.abs(h[i]-h[i-2]),res); 
				
		return dp[i] = res;
		
	}

	public static void main(String[] args) {
		Scanner stdIn  = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		long[] h = new long[100010];
		long[] dp = new long[100010];
		
		for(int i = 0; i < n; i++) {
			h[i] = stdIn.nextLong();
		}
		
		Arrays.fill(dp,Long.MAX_VALUE);
		
		
		System.out.println(rec(n-1,dp,h));
		
		
	}

}
