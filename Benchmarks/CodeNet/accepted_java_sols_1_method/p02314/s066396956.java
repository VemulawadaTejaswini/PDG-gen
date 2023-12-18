import java.util.Scanner;

public class Main{
	public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int n=sc.nextInt();
    		int m=sc.nextInt();
    		int[] c=new int[m+1];
    		for(int i=1; i<=m; i++) {
    			c[i]=sc.nextInt();
    		}
    		int[] dp=new int[n+1];
    		for(int i=1; i<=n; i++) {
    			dp[i]=n+1;
    		}
    		dp[0]=0;
    		for(int i=1; i<=n; i++) {
    			for(int j=1; j<=m; j++) {
    				if(c[j]<=i) {
    					dp[i]=Math.min(dp[i-c[j]]+1, dp[i]);
    				}
    			}
    		}
    		System.out.println(dp[n]);
    	}
    }
}
