//package compilers;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int []arr=new int[n];
		int []dp= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0]=0;
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<=k;j++) {
				if(i-j>=0) {
					dp[i]=Math.min(dp[i],dp[i-j]+Math.abs(arr[i]-arr[i-j]));
				}
			}
		}
		System.out.println(dp[n-1]);
	}

}
