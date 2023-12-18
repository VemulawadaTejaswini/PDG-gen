import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] pasta = new int[N+1];
		int[][][] dp = new int[N+1][3][2];
		for(int i=0;i<K;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			pasta[a] = b;
		}
		if (pasta[1] != 0) {
			dp[1][pasta[1]-1][0] = 1;
		}else{
			for(int i=0;i<3;i++) {
				dp[1][i][0] = 1;
			}
		}
		for(int i=2;i<=N;i++) {
			for(int j=0;j<3;j++) {
				if (pasta[i] != 0 && pasta[i] != j+1) {
					continue;
				}
				for(int k=0;k<2;k++) {
					if (k==0) {
						int sum = 0;
						for(int j2=0;j2<3;j2++) {
							if (j==j2) {
								continue;
							}
							for(int k2=0;k2<2;k2++) {
								sum += dp[i-1][j2][k2];
							}
						}
						dp[i][j][k] = sum % 10000;
					}else{
						dp[i][j][k] = dp[i-1][j][k-1];
					}
				}
			}
		}
		int ans = 0;
		for(int j=0;j<3;j++) {
			for(int k=0;k<2;k++) {
				ans = (ans + dp[N][j][k]) % 10000;
			}
		}
		//System.out.println(Arrays.deepToString(dp));
		System.out.println(ans);
	}

}