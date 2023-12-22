import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		long[] dp = new long[100001];
		for(int i = 0; i < n; i++) {
			dp[i] = 9223372036854775807l;
		}
		
		dp[0] = 0;
		
		for(int i = 1; i < n; i++) {
			dp[i] = chmin(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1]));
			//System.out.println(" " +dp[i]);
			if(i>1)dp[i] = chmin(dp[i], dp[i - 2] + Math.abs(h[i] - h[i - 2]));
			//System.out.println(dp[i]);
		}
		
		/*for(int i = 0; i < n; i++) {
			System.out.println(dp[i]);
		}*/
		System.out.println(dp[n-1]);
	}
	
	
	
	
	
	
	
	
	public static  long chmin(long a,long b) {
		if(a > b) {
			a = b;
		}
		return a;
	}
}