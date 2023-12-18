import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n =scn.nextInt();
	int W = scn.nextInt();
	int[]v = new int[n];
	int[]w = new int[n];
	for(int i=0;i<n;i++)
	{
		w[i]=scn.nextInt();
		v[i]=scn.nextInt();
	}
	long []dp = new long[W+1];
	
	
		for(int j=0;j<n;j++)
		{
			for(int i=W;i>=w[j];i--)
			{
		     
				dp[i]=Math.max(dp[i], v[j]+dp[i-w[j]]);
		}
	}
	System.out.println(dp[W]);
}
}