import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		long MOD = 998244353;
		long dp[] = new long[S + 1];
//		dp[0] = 1;
		long p2 = 1;
		for(int i = 0 ; i < N; ++i){
			int a = sc.nextInt();
			long next[] = new long[S + 1];
			for(int x = 0 ; x < next.length ; ++x){
				long ret = 0;
				if(x == a){
					ret = 1;
				}
				if(x >= a){
					ret += dp[x -a];
				}
				ret += 2 * dp[x];
				ret = ret % MOD;
				next[x] = ret;
			}
			p2 = (p2 * 2) % MOD ;
			next[0] = (p2 + MOD - 1) % MOD;
			dp = next;
//			System.out.println(Arrays.toString(dp));
		}
		System.out.println(dp[S]);
	}
}
