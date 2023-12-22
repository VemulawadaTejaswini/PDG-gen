
import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k = sc.nextInt();
		int a[]=new int[n+1];
		a[0]=0;
		for(int i=1;i<=n;i++)
		a[i]=sc.nextInt();
	    int dp[]=new int[n+1];
	    dp[0]=0;
	    dp[1]=0;
	    if(k+1>=n)
	    System.out.println(Math.abs(a[n]-a[1]));
	    else{
	    for(int i=2;i<=(1+k);i++){
	        dp[i]=Math.abs(a[i]-a[1]);
	    }
	    dp[2]=Math.abs(a[2]-a[1]);
	    for(int i=k+2;i<=n;i++){
	        int c = k;
	        for(int j=1;j<=c;j++){
	            if(j==1){
	                dp[i]=dp[i-j]+Math.abs(a[i]-a[i-j]);
	                continue;
	            }
	            dp[i]=Math.min(dp[i-j]+Math.abs(a[i]-a[i-j]),dp[i]);
	            
	        }
	    }
	    	    System.out.println(dp[n]);}
	}
}