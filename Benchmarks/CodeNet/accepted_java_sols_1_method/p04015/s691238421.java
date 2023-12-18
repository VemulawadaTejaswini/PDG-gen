import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int[] x = new int[N];
		int max = A;
		for(int i = 0;i < N;i++) {
			x[i] = sc.nextInt();
			max = Math.max(max,x[i]);
		}
		sc.close();
		long[][][] dp = new long[N+10][N+10][N*max+10];
		for(int j = 0;j <= N;j++){
			for(int k = 0;k <= N;k++) {
				for(int s = 0;s <= N*max;s++) {
					if(j==0 && k==0 && s==0) {
						dp[j][k][s] = 1;
					}else if(j >= 1&& s < x[j-1]) {
						dp[j][k][s] = dp[j-1][k][s];
					}else if(j >= 1&& k >= 1 && s >= x[j-1]) {
						dp[j][k][s] = dp[j-1][k][s] + dp[j-1][k-1][s-x[j-1]];
					}else {
						dp[j][k][s] = 0;
					}
				}
			}
		}
		long res = 0;
		for(int k = 1;k <= N;k++) {
			res += dp[N][k][k*A];
		}
		System.out.println(res);
	}
}