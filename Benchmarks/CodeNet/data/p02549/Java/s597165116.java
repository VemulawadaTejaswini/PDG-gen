/**
 * @author sakt_coder
 * created on 2020-09-19 17:41
 */
import java.io.*;
import java.util.*;
public class Main
{
	
	final long mod=998244353;
	private void solve()throws Exception
	{
		int n=nextInt();
		int k=nextInt();
		int l[]=new int[n+1];
		int r[]=new int[n+1];
		for(int i=1;i<=k;i++)
		{
			l[i]=nextInt();
			r[i]=nextInt();
		}
		long sum=0;
		long dp[]=new long[n+1];
		dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=k;j++)
			{
				//allowed are i-r[j] to i-l[j]
				if(i-r[j]-1>=1)
					sum=(sum-dp[i-r[j]-1]+mod)%mod;
				if(i-l[j]>=1)
					sum=(sum+dp[i-l[j]])%mod;
			}
			dp[i]=sum;
		}
		out.println(dp[n]);
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws Exception
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws Exception{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws Exception{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws Exception{
		return br.readLine();
	}
	int nextInt()throws Exception{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws Exception{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws Exception{
		return Double.parseDouble(nextToken());
	}
}
