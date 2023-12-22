import java.util.*;
public class Main{ 

   public static void main(String args[]) {
	 
    Scanner s=new Scanner(System.in);
    
    	int n=s.nextInt();
    	int k=s.nextInt();
    	long h[]=new long[n];
    	for(int i=0;i<n;i++) {
    		h[i]=s.nextLong();
    	}
    	long dp[]=new long[n];
    	dp[0]=0;
    	dp[1]=Math.abs(h[1]-h[0]);
    	
    	for(int i=2;i<n;i++) {
    		dp[i]=Long.MAX_VALUE;
    		for(int j=1;j<=k;j++) {
    		 if(i-j>=0) {
	    		 long op1=dp[i-j] + Math.abs(h[i]-h[i-j]);
	    		 dp[i]=Math.min(dp[i], op1);
    		 }else {
    			 break;
    		 }
    	 }
    	}
    	System.out.println(dp[n-1]);
    	
    }
}