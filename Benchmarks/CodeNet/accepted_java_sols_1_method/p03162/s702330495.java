import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n =scn.nextInt();
	int[]dp = new int[3];
	Arrays.fill(dp, 0);
	for(int day=0;day<n;day++)
	{
		int[]cost = new int[3];
		for(int i=0;i<3;i++)
		{
			cost[i]=scn.nextInt();
		}
		int[]newdp = new int[3];
		Arrays.fill(newdp, 0);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i!=j)
				newdp[j]=Math.max(newdp[j], dp[i]+cost[j]);
			}
		}
		dp=newdp;
	}
	System.out.println(Math.max(dp[0], Math.max(dp[1], dp[2])));
}
}
