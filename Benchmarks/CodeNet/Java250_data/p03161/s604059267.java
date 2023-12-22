
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedList;

public class Main {

	
	

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		

		int n=scn.nextInt();
		int k=scn.nextInt();
		int cost[]=new int[n];
		for(int i=0;i<n;i++){
			cost[i]=scn.nextInt();
		}
		int dp[]=new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE/2);
		dp[0]=0;
		for(int i=0;i<n;i++){
			for(int j=i-1;j>=i-k && j>=0;j--){
				dp[i]=Math.min(dp[i], Math.abs(cost[i]-cost[j])+dp[j]);
			}
		}
		
		
		
		
		System.out.println(dp[n-1]);

	}

}