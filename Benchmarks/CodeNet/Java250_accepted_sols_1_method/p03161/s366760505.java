import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	int n = scn.nextInt();
	int k = scn.nextInt();
	int[]h = new int[n];
	for(int i=0;i<n;i++)
	{
		h[i]=scn.nextInt();
	}
	int[]dp=new int[n];
	Arrays.fill(dp, Integer.MAX_VALUE);
	dp[0]=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<=i+k;j++)
		{
			if(j<n&&dp[i]!=Integer.MAX_VALUE)
			{
				dp[j]=Math.min(dp[j], Math.abs(h[j]-h[i])+dp[i]);
			}
		}
	}
	System.out.println(dp[n-1]);
}
}