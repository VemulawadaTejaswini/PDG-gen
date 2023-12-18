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
				int[] v = new int[n+1];
				int[] w = new int[n+1];
				for(int i=0;i<n;i++) {
					String[] str = sc.next().split(",");
					v[i] = Integer.parseInt(str[0]);
					w[i] = Integer.parseInt(str[1]);
				}
				dp = new int[n+2][W+1];
				for(int i=0;i<=W;i++) {
					dp[0][i] = 0;
				}
				
				answ= Integer.MAX_VALUE;
				int ansv = Integer.MIN_VALUE;
				for(int i=1;i<=n;i++){
	                for(int j=1;j<=W;j++){
	                    if(j-w[i]>=0){
	                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
	                        if(ansv < dp[i][j]){
	                            ansv = dp[i][j];
	                            answ = j;
	                        }
	                        else if(ansv == dp[i][j]){
	                            answ= Math.min(answ, j);
	                        }
	                    }
	                    else dp[i][j] = dp[i-1][j];
	                }
	            }
				System.out.println("Case "+cnt+":");
				System.out.println(ansv);
				System.out.println(answ);
				
			}
			
			return;
		}
	}
}

