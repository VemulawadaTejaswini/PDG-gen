import java.math.*;
import java.util.*;
  


public class Main {
	
	
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt(),m=scan.nextInt();
        int v[]=new int[m];
        for(int i=0;i<m;i++) { 
        	v[i]=scan.nextInt(); 	
        }
        int dp[]=new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<m;i++) {
        	for(int j=v[i];j<=n;j++) {
        		dp[j]=Math.min(dp[j],dp[j-v[i]]+1);
        	}
        }
        System.out.println(dp[n]);
        
        
	}
	
	
	
}
