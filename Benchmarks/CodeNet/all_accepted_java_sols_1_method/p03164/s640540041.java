//package compilers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int [][]arr=new int[n][2];
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=in.nextInt();
				if(j==1)
					sum+=arr[i][j];
			}
		}
		
		long dp[]=new long [sum+1];
		//System.out.println(sum);
		Arrays.fill(dp, (long)1e18+5);
		dp[0]=0;
		for(int i=0;i<n;i++) {
			for(int j=sum;j>=0;j--) {
				if(j-arr[i][1]>=0) {
				dp[j]=Math.min(dp[j], dp[j-arr[i][1]]+arr[i][0]);
				
				}
			}
		}
		long ans=0;
		for(int i=0;i<=sum;i++) {
			//System.out.print(dp[i] + " ");
			if(dp[i]<=k)
				ans=Math.max(i,ans);
		}
		System.out.println(ans);
		
	}

}
