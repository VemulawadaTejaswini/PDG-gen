import java.util.Scanner;
public class Main {
    
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int W = sc.nextInt();
				if(W == 0) break;
				int N = sc.nextInt();
				int[] v = new int[N+1];
				int[] w = new int[N+1];
				for(int i=1; i<=N; i++) {
					String[] s = sc.next().split(",");
					v[i] = Integer.parseInt(s[0]);
					w[i] = Integer.parseInt(s[1]);
				}
				int[][] dp = new int[N+1][W+1];
				int maxV = Integer.MIN_VALUE;
				int minW = Integer.MAX_VALUE;
				for(int i=1; i<=N; i++) {
					for(int j=1; j<=W; j++) {
						if(j-w[i] >= 0) {
							dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
							if(maxV < dp[i][j]) {
								maxV = dp[i][j];
								minW = j;
							}
							else if(maxV == dp[i][j]) {
								minW = Math.min(minW, j);
							}
						}
						else dp[i][j] = dp[i-1][j];
					}
				}
				int c = 1;
				System.out.println("Case " + c++ + ":\n" + maxV + "\n" + minW);
			}
		}
	}
}
