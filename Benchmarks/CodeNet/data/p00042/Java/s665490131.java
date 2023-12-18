
import java.util.Scanner;

public class Main{ 
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int cnt = 0;
			
			int[] ansN = new int[51];
			int[] ansW = new int[51];
			int[][] dp = new int[1001][1001];
			int answ = 0;
			while(sc.hasNext()) {
				cnt++;
				int W = sc.nextInt();
				if(W==0)break;
				int n = sc.nextInt();
				ansN[cnt] = n;
				ansW[cnt] = W;
				int[] v = new int[n];
				int[] w = new int[n];
				for(int i=0;i<n;i++) {
					String[] str = sc.next().split(",");
					v[i] = Integer.parseInt(str[0]);
					w[i] = Integer.parseInt(str[1]);
				}
				dp = new int[n+1][W+1];
				for(int i=0;i<=W;i++) {
					dp[0][i] = 0;
				}
				
				answ=0;
				for(int i=0;i<n;i++) {
					for(int j=0;j<=W;j++) {
						if(j>=w[i]) {
							if(dp[i][j]<dp[i][j-w[i]]+v[i])
								answ = j;
							if(dp[i][j]==dp[i][j-w[i]]+v[i])
								answ = Math.min(answ, j);
							dp[i+1][j] = Math.max(dp[i][j], dp[i][j-w[i]]+v[i]);
						}
						else
							dp[i+1][j] = dp[i][j];
					}
				}
			}
			for(int i=1;i<cnt;i++) {
					System.out.println("Case "+i+":");
					System.out.println(dp[ansN[i]][ansW[i]]);
					System.out.println(answ);
			}
			return;
		}
	}
}

