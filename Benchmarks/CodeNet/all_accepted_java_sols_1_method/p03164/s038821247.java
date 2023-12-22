import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); int W = Integer.parseInt(st.nextToken());
		int[] w = new int[N]; int[] v = new int[N];
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			int val = Integer.parseInt(st.nextToken());
			v[i] = val;
			sum += val;
		}
		
		long[] dp = new long[sum+1];
		Arrays.fill(dp, (long) 1e18+5);
		dp[0] = 0;
		for(int i=0; i<N ;i++) {
			for(int j=sum; j>=0; j--) {
				if(j-v[i] >= 0) {
					dp[j] = Math.min(dp[j], dp[j-v[i]]+w[i]);
				}else {
					dp[j] = dp[j];
				}
			}
		}
		
		long ans = 0;
		for(int i=0; i<= sum; i++) {
			if(dp[i] <= W) {
				ans = Math.max(ans, (long) i);
			}
		}
		System.out.println(ans);
	}

}
