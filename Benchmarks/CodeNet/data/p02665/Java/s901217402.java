import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N+1];
		Arrays.setAll(A, i -> sc.nextLong());
		long[] S = new long[N+1];
		S[0] = A[N];
		for(int i = 1; i <= N; i++)
			S[i] = S[i-1] + A[N-i];
		long ans = 1;
		long[] dp = new long[N+2];
		dp[0] = 1 - A[0];
		for(int i = 0; i < N; i++) {
			dp[i+1] = Math.min((dp[i]-A[i])*2, S[N-i-1]);
			if(dp[i+1] < 0) {
				System.out.println(-1);
				return;
			}
			ans += dp[i+1];
		}			
		System.out.println(ans);
	}

}