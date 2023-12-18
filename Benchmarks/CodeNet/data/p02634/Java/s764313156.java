import java.util.*;

public class Main {

	static int mod = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		long[][] dp = new long[C+1][D+1];
		dp[A][B] = 1L;
		for (int j=B;j<D;j++) {
			dp[A][j+1] = dp[A][j]*A%mod;
		}
		for (int i=A;i<C;i++) {
			dp[i+1][B] = dp[i][B]*B%mod;
		}
		for (int i=A;i<C;i++) {
			for (int j=B;j<D;j++) {
				dp[i+1][j+1] = (dp[i+1][j]*(i+1)%mod+dp[i][j+1]*(j+1)%mod-dp[i][j]*(long)i%mod*j%mod+mod)%mod;
			}
		}
		System.out.println(dp[C][D]);
	}
}