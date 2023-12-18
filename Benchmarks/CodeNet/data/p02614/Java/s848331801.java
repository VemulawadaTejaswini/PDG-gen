import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws Exception
	{
		int n=nextInt();
		int m=nextInt();
		int k=nextInt();
		int c[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++)
		{	
			String s=nextLine();
			for(int j=1;j<=m;j++)
			{
				if(s.charAt(j-1)=='#')
					c[i][j]=1;
			}	
		}
		int bigmask=(1<<(n+m))-1;
		int ans=0;
		for(int mask=0;mask<=bigmask;mask++)
		{
			int curr=0;
			for(int i=1;i<=n;i++)
				for(int j=1;j<=m;j++)
				{
					int bitrow=(mask>>(i-1))&1;
					int bitcol=(mask>>(n+j-1))&1;
					if(bitrow==0 && bitcol==0)
						curr+=c[i][j];
				}
			if(curr==k)
				ans++;
		}
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