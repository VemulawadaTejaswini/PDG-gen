
import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		a[0]=0;
		for(int i=1;i<=n;i++)
		a[i]=sc.nextInt();
	    int dp[]=new int[n+1];
	    dp[0]=0;
	    dp[1]=0;
	    dp[2]=Math.abs(a[2]-a[1]);
	    for(int i=3;i<=n;i++){
	        dp[i]=Math.min(dp[i-1]+Math.abs(a[i]-a[i-1]),
	        dp[i-2]+Math.abs(a[i]-a[i-2]));
	    }
	    System.out.println(dp[n]);
	}
}