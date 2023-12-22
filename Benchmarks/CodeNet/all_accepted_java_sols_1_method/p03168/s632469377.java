import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double p[] = new double[N];
		for(int i=0;i<N;i++) p[i]=sc.nextDouble();
		sc.close();
		
		double dp[][] = new double[N+1][N+1]; //i枚目を投げた段階の、表の数kの確率
		dp[0][0]=1;//１枚も投げていないとき、表０枚の確率が1
		//配るDP
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				dp[i+1][0] = dp[i][0]*(1-p[i]);
				dp[i+1][j+1] += dp[i][j+1]*(1-p[i]) + dp[i][j]*p[i];
			}
		}
		//N枚投げたあと
		double ans = 0;
		int half = (N+1)/2;
		for(int i=half;i<N+1;i++) {
			ans += dp[N][i];
		}
		System.out.println(ans);
	}
}
