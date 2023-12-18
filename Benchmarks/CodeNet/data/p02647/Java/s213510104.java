import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws Exception
	{
		int n=nextInt();
		int k=nextInt();
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=nextInt();
		while(k-->0)
		{
			int b[]=new int[n+1];
			for(int i=1;i<=n;i++)
			{
				b[Math.max(1,i-a[i])]++;
				int r=Math.min(n,i+a[i]);
				if(r!=n)
					b[r+1]--;
			}
			for(int i=1;i<=n;i++)
				b[i]+=b[i-1];
			a=b;
			boolean flag=true;
			for(int i=1;i<=n;i++)
				if(a[i]!=n)
					flag=false;
			if(flag)
				break;
		}
		for(int i=1;i<=n;i++)
			out.print(a[i]+" ");
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