import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[][] dp;
		int n=1,x=1;
	 	dp=new int[5][500];
		while(n!=0 || x!=0){
			for(int i=0;i<=3;i++)Arrays.fill(dp[i],0);
			n=sc.nextInt();
			x=sc.nextInt();
			dp[0][0]=1;
			for(int i=1;i<=n;i++){
				for(int j=2;j>=0;j--){
					for(int k=0;k<=x;k++)dp[j+1][k+i]+=dp[j][k];
				}
			}
			if(x>=0)System.out.println(dp[3][x]);
			else System.out.println(0);
		}
	}
}