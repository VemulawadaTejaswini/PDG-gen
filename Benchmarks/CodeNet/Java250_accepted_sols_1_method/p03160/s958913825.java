import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int h[]=new int[N];
		for(int i=0;i<N;i++) {
			h[i]=sc.nextInt();
		}
		int dp[]=new int[N];
		dp[0]=0;
		for(int j=1;j<N;j++) {
			dp[j]=Integer.MAX_VALUE;
		}
		for(int k=0;k<N;k++) {
			if(k+1<N) {
				dp[k+1]=Math.min(dp[k+1],dp[k]+Math.abs(h[k+1]-h[k]));
			}
			if(k+2<N) {
				dp[k+2]=Math.min(dp[k+2],dp[k]+Math.abs(h[k+2]-h[k]));
			}
		}
		System.out.println(dp[N-1]);
	}
}