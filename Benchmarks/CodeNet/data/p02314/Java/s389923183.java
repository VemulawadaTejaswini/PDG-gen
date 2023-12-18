package AOJ_DPL_1_A;

import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[] a=new int[m+1];
		int[] dp=new int[n+1];
		for(int i=1;i<=m;i++)
			a[i]=in.nextInt();
		for(int i=1;i<=n;i++)
			dp[i]=0x3f3f3f3f;
		dp[0]=0;
		for(int i=1;i<=m;i++)
			for(int j=0;j<=n;j++)
				if(j-a[i]>=0)
					dp[j]=Math.min(dp[j],dp[j-a[i]]+1);
		System.out.println(dp[n]);
	}
}