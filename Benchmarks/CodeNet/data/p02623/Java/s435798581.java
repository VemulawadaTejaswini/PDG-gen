import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int M = Integer.valueOf(s.next());
		long K = Long.valueOf(s.next());
		long[] A = new long[N+1];
		long[] B = new long[M+1];
		long[][] dp = new long[N+2][M+2];
		int ret = 0;
		dp[0][0] = 0;
		for(int i = 0; i < N; i++) {
			A[i] = Long.valueOf(s.next());
			dp[i+1][0] = dp[i][0] + A[i];
		}
		for(int i = 0; i < M; i++) {
			B[i] = Long.valueOf(s.next());
		}
		A[N] = B[M] = K;
		
		for(int i = 1; i <= N; i++) {
			if(dp[i][0] > K) {
				ret = Math.max(ret, i-1);
				break;
			}
			for(int j = 0; j <= M; j++) {
				dp[i][j+1] = dp[i][j] + B[j];
				if(dp[i][j+1] > K) {
					ret = Math.max(ret, i + j);
					break;
				}
			}
		}
		System.out.println(ret);
	}
}