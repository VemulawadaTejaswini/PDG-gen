import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int W = s.nextInt();
		int[] v = new int[N];
		int[] w = new int[N];
		for(int i = 0; i < N; i++) {
			v[i] = s.nextInt();
			w[i] = s.nextInt();
		}
		
		long[][] dp = new long[N + 1][100 * 1010];
		
		for(int i = 1; i < N + 1; i++) {
			for(int j = 0; j < W + 1; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j]);
				dp[i][j + w[i-1]] = Math.max(dp[i - 1][j] + v[i-1], dp[i][j + w[i-1]]);
			}
		}
		
		System.out.println(dp[N][W]);	
    }
}
