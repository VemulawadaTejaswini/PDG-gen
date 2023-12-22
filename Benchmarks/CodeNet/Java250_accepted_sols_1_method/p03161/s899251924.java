import java.util.*;
public class Main
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int K =sc.nextInt();
		
		int cost[] =new int[N];
		for(int i=0;i<N;i++)
		{
		
			cost[i]= sc.nextInt();
		}
		int dp[] =new int [N+1];
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0]=0;
		dp[1]=Math.abs(cost[1]-cost[0]);
		//dp[1]=cost[1]-cost[0];
		
		for(int i=2;i<N;i++)
		{
			 for(int j=i-1,jump=0;j>=0 && jump<K;j--,jump++)
			 {
			 	dp[i]=Math.min(dp[i],Math.abs(cost[i]-cost[j]) +dp[j]);
			 }
		}
		
		System.out.println(dp[N-1]);
	}

}