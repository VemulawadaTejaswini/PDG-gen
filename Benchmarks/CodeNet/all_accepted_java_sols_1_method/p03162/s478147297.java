import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp=new int[n][3];
		dp[0][0]=sc.nextInt();
		dp[0][1]=sc.nextInt();
		dp[0][2]=sc.nextInt();
		for(int i = 1; i<n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			dp[i][0]=a+Math.max(dp[i-1][1],dp[i-1][2]);
			dp[i][1]=b+Math.max(dp[i-1][0],dp[i-1][2]);
			dp[i][2]=c+Math.max(dp[i-1][0],dp[i-1][1]);
		}
		System.out.println(Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
	}
}
