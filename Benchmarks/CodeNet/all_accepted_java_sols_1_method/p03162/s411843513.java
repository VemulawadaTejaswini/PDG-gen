import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
			b[i]=scn.nextInt();
			c[i]=scn.nextInt();
			
		}
		int[][] dp =new int[n][3];
		dp[0][0]=a[0];
		dp[0][1]=b[0];
		dp[0][2]=c[0];
		for(int i=1;i<n;i++) {
			dp[i][0]=a[i]+Math.max(dp[i-1][1], dp[i-1][2]);
			dp[i][1]=b[i]+Math.max(dp[i-1][0], dp[i-1][2]);
			dp[i][2]=c[i]+Math.max(dp[i-1][0],dp[i-1][1]);
			
		}
		System.out.println(Math.max(Math.max(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
		
		
	}

}
