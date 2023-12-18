import java.math.BigInteger;
import java.util.Scanner;
class Main {
	long[][] dp;
	
	public static void main(String args[]){
		Main app = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] number = new int[n];
		for(int i=0;i<n;i++){
			number[i] = scan.nextInt();
		}
		app.dp = new long[n][21];
		System.out.println(app.exec(number,n));
	}
	
	public long exec(int[] num,int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<20;j++){
				dp[i][j] = 0;
			}
		}
		dp[0][num[0]]++;
		for(int i=0;i<n-2;i++){
			for(int j=0;j<=20;j++){
				if(dp[i][j]>0){
					if(j+num[i+1]<=20){
						dp[i+1][j+num[i+1]]+=dp[i][j];
					}
					if(j-num[i+1]>=0){
						dp[i+1][j-num[i+1]]+=dp[i][j];
					}
				}
			}
		}
		return dp[n-2][num[n-1]];
	}
}