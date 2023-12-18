import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		new Main().main();
	}
	void main() {
		Scanner sc = new Scanner(System.in);
		
		long[][] dp = new long[11][1001];
		dp[0][0] = 1;
		for(int j=1;j<=1000;j++) {
			dp[0][j] = 0;
		}
		for(int d=0;d<=100;d++) {
			for(int i=10;i>=1;i--) {
				for(int j=d;j<=1000;j++) {
					dp[i][j] += dp[i-1][j-d];
				}
			}
		}
		while(true) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n + s == 0) break;
			System.out.println(dp[n][s]);
		}
	}
}
