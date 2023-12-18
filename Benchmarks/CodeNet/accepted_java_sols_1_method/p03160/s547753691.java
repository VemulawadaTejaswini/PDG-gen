import java.util.*;
import java.lang.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int cost[] = new int[n];
		for(int i=0;i<n;i++){
		    cost[i] = sc.nextInt();
		}
		int dp[]=new int[n];
		for(int i=1;i<n;i++){
		    dp[i] = dp[i-1]+Math.abs(cost[i]-cost[i-1]);
		    if (i-2>=0){
		        dp[i] = Math.min((dp[i-2]+Math.abs(cost[i-2]-cost[i])), dp[i]);
		    }
		}
	    System.out.println(dp[n-1]);
		
	}
}