import java.util.*;

class Main {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int dp[][] = new int[301][18];
		int ans[]  = new int[301];
		for(int i=0; i<18; i++)
			dp[0][i] = 1;
		for(int i=1; i<=300; i++){
			for(int j=1; j*j<=i; j++){
				for(int k=j*j; k<=i; k+=j*j){
					dp[i][j] += dp[i-k][j-1];
				}
			}
			for(int j=1; j<=17; j++){
				dp[i][j] += dp[i][j-1];
			}
		}
		for(int i=0; i<=300; i++)
			for(int j=0; j<=17; j++)
				ans[i] += dp[i][j];
		while(true){
			int n = in.nextInt();
			if(n==0) return ;
			System.out.println(dp[n][17]);
		}
	}
}