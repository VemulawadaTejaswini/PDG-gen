import java.util.*;
import java.io.*;
class Main
{
	static StringBuilder sb;
	public static final boolean ONLINE_JUDGE=false;
	public static void main(String []args)throws IOException
	{
		sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		if(ONLINE_JUDGE)
		{
			File file=new File("output.txt");
			sc=new Scanner(new FileReader(new File("input.txt")));
			PrintStream ps=new PrintStream(file);
			System.setOut(ps);
		}
		int t=1;
		for(int tt=1;tt<=t;tt++)
		{
			int n=sc.nextInt();
			int a[][]=new int[n][3];
			for(int i=0;i<n;i++)
			{
				a[i][0]=sc.nextInt();
				a[i][1]=sc.nextInt();
				a[i][2]=sc.nextInt();
			}
			int dp[][]=new int[n][3];
			for(int i=0;i<3;i++)
				dp[0][i]=a[0][i];
			for(int i=1;i<n;i++)
			{
				dp[i][0]=Math.max(dp[i-1][1],dp[i-1][2])+a[i][0];
				dp[i][1]=Math.max(dp[i-1][0],dp[i-1][2])+a[i][1];
				dp[i][2]=Math.max(dp[i-1][0],dp[i-1][1])+a[i][2];
			}
			System.out.println(Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
		}
	}
}