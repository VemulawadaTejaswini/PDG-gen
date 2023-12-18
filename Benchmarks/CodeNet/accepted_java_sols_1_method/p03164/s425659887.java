import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		long[] w = new long[N];
		int[] v = new int[N];
		int V = 0;
		for(int i=0; i<N; i++){
			w[i] = sc.nextLong();
			v[i] = sc.nextInt();
			V += v[i];
		}
		long[][] dp = new long[N+1][V+1];
		for(int i=0; i<N+1; i++){
			for(int j=1; j<V+1; j++){
				if(i == 0 && j != 0){
					dp[i][j] = 1000000010;
				}
				else if(j < v[i-1]){
					dp[i][j] = dp[i-1][j];
				}
				else{
					dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-v[i-1]] + w[i-1]);
				}
			}
		}
		for(int i=V; i>=0; i--){
			if(dp[N][i] <= W){
				System.out.println(i);
				break;
			}
		}
	}
}