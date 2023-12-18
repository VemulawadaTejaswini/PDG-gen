//package compilers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int [][]arr=new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=in.nextInt();
			}
		}
		long dp[]=new long [k+1];
		for(int i=0;i<n;i++) {
			for(int j=k;j>=0;j--) {
				if(j-arr[i][0]>=0)
				dp[j]=Math.max(dp[j], dp[j-arr[i][0]]+arr[i][1]);
			}
		}
		System.out.println(dp[k]);
		
	}

}
