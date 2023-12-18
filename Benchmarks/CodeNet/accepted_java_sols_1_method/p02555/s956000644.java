import java.util.Scanner;

public class Main {
	static Long num;
	static long mod = 1000000007;
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int S = Integer.parseInt(sc.next());
			long[] dp = new long[S+1];
			dp[0]=1;
			
			long x=0;
			for(int i=3;i<=S;i++) {
				x=(x + dp[i-3])%mod;
				dp[i]=x;
			}
			System.out.println(dp[S]);
		}
	}
}