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
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int dp[]=new int[n];
			Arrays.fill(dp,Integer.MAX_VALUE);
			dp[0]=0;
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<=i+k;j++)
				{
					if(j>=n)continue;
					dp[j]=Math.min(dp[j],dp[i]+Math.abs(a[i]-a[j]));
				}
			}
			System.out.println(dp[n-1]);
		}
	}
}