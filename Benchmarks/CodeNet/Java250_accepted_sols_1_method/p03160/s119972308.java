import java.util.ArrayList;
import java.util.*;
  public class Main
{
	public static void main (String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		int h[]=new int[n];
		for(i=0;i<n;i++)
			h[i]=sc.nextInt();
		int dp[]=new int[n];
		//Arrays.fill(dp, );
		for(i=0;i<n;i++)
		{
			if(i-1>=0&&i-2>=0)
				dp[i]+=Math.min(Math.abs(h[i-2]-h[i])+dp[i-2],Math.abs(h[i-1]-h[i])+dp[i-1]);
			else if(i-1>=0)
				dp[i]+=Math.abs(h[i-1]-h[i]+dp[i-1]);
		}
		System.out.println(dp[n-1]);
	}
}