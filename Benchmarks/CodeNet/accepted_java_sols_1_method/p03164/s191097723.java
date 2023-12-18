import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long W = s.nextLong();
		int[] wei = new int[N + 1];
		int[] val = new int[N + 1];
		for(int i = 1; i < N + 1; i++) {
			wei[i] = s.nextInt();
			val[i] = s.nextInt();
		}
		wei[0] = val[0] = 0;
		
		long[][] dp = new long[N + 1][201010];
		for(int n = 0; n < N + 1; n++) {			
			for(int i = 0; i < N * 1010; i++) {
				dp[n][i] = 2036854775807l;
			}
		}
		dp[0][0] = 0;
		
		for(int n = 1; n < N + 1; n++) {
			for(int v = 1; v < N * 1010 + 1; v++) {
				dp[n][v - 1] = Math.min(dp[n - 1][v - 1], dp[n][v - 1]);
				dp[n][v - 1 + val[n]] = Math.min(dp[n - 1][v - 1] + wei[n], dp[n][v-1 + val[n]]);
			}
		}
		
		int result = 0;
			for(int v = 0; v < N * 1000 + 1; v++) {
				if(dp[N][v] <= W && result < v)
					result = v;
			}
		
		
		System.out.println(result);
    }
}