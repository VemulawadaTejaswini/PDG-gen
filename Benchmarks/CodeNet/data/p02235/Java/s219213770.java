import java.util.Scanner;

public class Main {
	
	static int dp(String x, String y) {
		int[][] dp=new int[1010][1010];
		if(x.charAt(0)==y.charAt(0)) {
			dp[0][0]=1;
		}
		else if(x.charAt(0)!=y.charAt(0)) {
			dp[0][0]=0;
		}
		for(int i=1; i<x.length(); i++) {
			if(x.charAt(i)==y.charAt(0)) {
				dp[i][0]=1;
			}
			else {
				dp[i][0]=dp[i-1][0];
			}
		}
		for(int i=1; i<y.length(); i++) {
			if(y.charAt(i)==x.charAt(0)) {
				dp[0][i]=1;
			}
			else {
				dp[0][i]=dp[0][i-1];
			}
		}
		
		for(int i=1; i<x.length(); i++) {
			for(int j=1; j<y.length(); j++) {
				if(x.charAt(i)==y.charAt(j)) {
					dp[i][j]=Math.max(Math.max(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1])+1;
				}
				else {
					dp[i][j]=Math.max(Math.max(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
				}
			}
		}
		return dp[x.length()-1][y.length()-1];
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q=sc.nextInt();
			String x, y;
			for(int k=0; k<q; k++) {
				x=sc.next();
				y=sc.next();
				System.out.println(dp(x, y));
			}
			

		}
	}
}
