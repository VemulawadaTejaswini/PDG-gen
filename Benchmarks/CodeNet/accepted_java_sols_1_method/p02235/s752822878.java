import java.math.*;
import java.util.*;
  


public class Main {
	
	
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        while(n-->0) {
        	String a=scan.nextLine(),b=scan.nextLine();
        	int dp[][]=new int[1005][1005];
        	int max=0;
        	a=" "+a;
        	b=" "+b;
        	for(int i=1;i<a.length();i++) {
        		for(int j=1;j<b.length();j++) {
        			if(a.charAt(i)!=b.charAt(j)) {
        				dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        			}else {
        				dp[i][j]=dp[i-1][j-1]+1;
        			}
        			max=Math.max(max, dp[i][j]);
        		}
        		
        	}
        	System.out.println(max);
        }
        
	}
	
	
	
}
