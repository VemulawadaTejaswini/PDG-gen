import java.util.Scanner;

/**
 * https://abc044.contest.atcoder.jp/tasks/arc060_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int[] x = new int[N];
		int sum = 0;
		for(int i=0; i<N; i++){
			x[i] = sc.nextInt();
			sum += x[i];
		}
		sc.close();
		
		long[][][] dp = new long[N][N+1][sum+1];
		dp[0][1][x[0]]=1;
		for(int i=1; i<N; i++){
			for(int k=1; k<=(i+1); k++){
				for(int s=0; s<=sum; s++){
					if(s<x[i]){
						dp[i][k][s] = dp[i-1][k][s];
					}else if(s>=x[i]){
						if(k==1 && x[i]==s){
							dp[i][k][s] = dp[i-1][k][s]+1;
						}else{
							dp[i][k][s] = dp[i-1][k][s]+dp[i-1][k-1][s-x[i]];
						}
					}
				}
			}
		}
		
		long ans = 0;
		for(int k=1; k<=N; k++){
			if(k*A<=sum) ans += dp[N-1][k][k*A];
		}
		
		System.out.println(ans);
		
	}
	

}
