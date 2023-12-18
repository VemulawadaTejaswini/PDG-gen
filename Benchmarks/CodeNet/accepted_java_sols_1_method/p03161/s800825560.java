import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int h[]=new int[n];
 	int k=s.nextInt();
	for(int i=0;i<n;i++)
	h[i]=s.nextInt();
	int dp[]=new int[n];
	dp[0]=0;
	int min=Integer.MAX_VALUE;
	int a1=0;
	for(int i=1;i<n;i++)
	{
	 if(i<=k)
	dp[i]=Math.abs(h[i]-h[0]);
	  else
	   {
	      
	    for(int j=i-k;j<i;j++)
		{
		if(dp[j]+Math.abs(h[j]-h[i])<min)
		min=dp[j]+Math.abs(h[i]-h[j]);
		
		}
	dp[i]=min;
	min=Integer.MAX_VALUE;
	   }
	}
	
	System.out.println(dp[n-1]);
	}
}