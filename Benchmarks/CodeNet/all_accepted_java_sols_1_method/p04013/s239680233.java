import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		int A = sn.nextInt();
		int x[] = new int[52];
		long[][][] dp = new long[50+2][50+2][50*50+2];
		int max_x = -1;
		for(int i = 0;i < N;++i){
			x[i] = sn.nextInt();
			max_x = Math.max(x[i],max_x);
		}
		
		for(int j = 0; j <= N; ++j){
			for(int k = 0; k <= N; ++k){
				for(int s = 0; s <= N*N; ++s){
					dp[j][k][s] = 0;
				}
			}
			dp[j][0][0] = 1;
		}
		
		for(int j = 1; j <= N; ++j){
			for(int k = 1; k <= N; ++k){
				for(int s = 1; s <= N*max_x; ++s){					
					if(s < x[j-1]) dp[j][k][s] = dp[j-1][k][s];
					else{
						dp[j][k][s] = dp[j-1][k][s] + dp[j-1][k-1][s-x[j-1]];
					}					
				}
			}
		}
		/*
		for(int j = 0; j <= N ;++j){
			for(int s = 0; s <=  N*max_x; ++s){
				System.out.print(dp[j][1][s]);
				System.out.print(' ');
			}
			System.out.println();
		}
		*/
		long ans = 0;
		for(int k = 1; k <= N; ++k){
			ans += dp[N][k][k*A];
		}		
		System.out.println(ans);
	}
}
