import java.io.*;
import java.util.*;
public class Main
{
	final int maxn=(int)(1e6);
	private void solve()throws Exception
	{
		int n=nextInt();
		int hash[]=new int[maxn+1];
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=a[i];j<=maxn;j+=a[i])
				hash[j]++;
		}
		int ans=0;
		for(int i=1;i<=n;i++)
			if(hash[a[i]]==1)
				ans++;
		out.println(ans);
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