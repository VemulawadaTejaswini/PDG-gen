import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws Exception
	{
		int n=nextInt();
		int cnt[]=new int[n+1];
		for(int x=1;x*x<=n;x++)
			for(int y=1;y*y<=n;y++)
				for(int z=1;z*z<=n;z++)
				{
					int curr=x*x+y*y+z*z+x*y+y*z+z*x;
					if(curr<=n)
						cnt[curr]++;
				}
		for(int i=1;i<=n;i++)
			out.println(cnt[i]);
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