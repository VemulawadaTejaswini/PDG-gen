import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		//amount of items
		int N = inputs.nextInt();
		//maximum allowed weight
		int W = inputs.nextInt();
		int[] weights = new int[N];
		int[] values = new int[N];
		for(int i=0;i<N;i++) {
			weights[i] = inputs.nextInt();
			values[i] = inputs.nextInt();
		}
		//stores if visited and totalvalue
		long[][] dp = new long[W+1][2];
		dp[0][0] = 1;
		for(int k = 0;k<N;k++) {
			for(int i = W;i>=weights[k];i--) {
				if(dp[i-weights[k]][0]==1) {
					dp[i][0] = 1;
					if(dp[i][1]==0) {
						dp[i][1] = dp[i-weights[k]][1] +values[k];
					}
					else {
						if(dp[i][1]>dp[i-weights[k]][1] +values[k])
							continue;
						else
							dp[i][1] = dp[i-weights[k]][1] +values[k];
					}
				}
			}
		}
		long ans = 0;
		for(int i =W;i>=0;i--) {
			if(dp[i][1]>ans) {
				ans = dp[i][1];
			}
		}
		System.out.println(ans);
	}

}
