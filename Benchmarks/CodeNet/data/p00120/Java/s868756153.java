import java.util.Scanner;

public class Main{
	
	void main() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			int W = Integer.parseInt(ss[0]);
			int n = ss.length - 1;
			int[] r = new int[n];
			for(int i=1;i<=n;i++) {
				r[i-1] = Integer.parseInt(ss[i]);
			}
			
			double[][] dp = new double[1<<n][n];
			double INF = 1<<28;
			for(int i=0;i<(1<<n);i++) {
				for(int j=0;j<n;j++) {
					dp[i][j] = INF;
				}
			}
			for(int i=0;i<n;i++) {
				dp[1<<i][i] = 2*r[i];
			}
			
			for(int i=0;i<(1<<n);i++) {
				for(int j=0;j<n;j++) {
					if(dp[i][j] == INF) continue;
					for(int k=0;k<n;k++) {
						if((i >> k & 1) == 1) continue;
						int nexti = i | (1 << k);
						double nextdp = dp[i][j] - r[j] + 2*Math.sqrt(r[j] * r[k]) + r[k];
						dp[nexti][k] = Math.min(dp[nexti][k], nextdp);
					}
					
				}
			}
			
			double ans = INF;
			for(int j=0;j<n;j++) {
				ans = Math.min(ans, dp[(1<<n)-1][j]);
			}
			System.out.println(ans<=W ? "OK":"NA");
		}
	}

	public static void main(String[] args) {
		new Main().main();
	}



}
