import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N+1];
		Arrays.setAll(A, i -> sc.nextInt());
		long ans = 0;
		long[] dp = new long[N+1];
		dp[0] = 1;
		for(int i = 0; i < N; i++) {
			dp[i+1] = (dp[i] - A[i]) * 2;
			if(dp[i+1] < A[i]) {
				System.out.println(-1);
				return;
			}
		}
		if(dp[N] < A[N]) {
			System.out.println(-1);
			return;
		}			
		int p = 0;
		for(int i = 0; i <= N; i++) {
			int t = p;
			while(true) {
				if(A[i] >= dp[t]) {
					ans += dp[t];
					dp[t] = 0;
					p++;
				}
				else {
					ans += A[i];
					dp[t] -= A[i];
				}
				t++;
				if(t > i)
					break;
			}
		}
		System.out.println(ans);
	}

}