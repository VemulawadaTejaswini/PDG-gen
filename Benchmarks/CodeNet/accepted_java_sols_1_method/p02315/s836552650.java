import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] v = new int[N];
		int[] w = new int[N];
		for(int i=0; i<N; i++){
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		int[][] dp = new int[N+1][W+1];
		for(int i=0; i<N; i++){
			for(int j=0; j<W+1; j++){
				if(j>=w[i]){
					dp[i+1][j] = Math.max(dp[i][j], dp[i][j-w[i]]+v[i]);
				}
				else{
					dp[i+1][j] = dp[i][j];
				}
			}
		}
		System.out.println(dp[N][W]);
	}
}
