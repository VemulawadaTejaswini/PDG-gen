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
		//stores if visited and totalweight
		long[][] dp = new long[100001][2];
		dp[0][0] = 1;
		for(int k = 0;k<N;k++) {
			for(int i = 100000;i>=values[k];i--) {
				if(dp[i-values[k]][0]==1&&dp[i-values[k]][1] +weights[k]<=W) {
					dp[i][0] = 1;
					if(dp[i][1]==0) {
						dp[i][1] = dp[i-values[k]][1] +weights[k];
					}
					else {
						if(dp[i][1]<dp[i-values[k]][1] +weights[k])
							continue;
						else
							dp[i][1] = dp[i-values[k]][1] +weights[k];
					}
				}
			}
		}
		long ans = 0;
		for(int i =100000;i>=0;i--) {
			if(dp[i][0]==1&&dp[i][1]<=W) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}

