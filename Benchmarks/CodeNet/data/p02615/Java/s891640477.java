import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws Exception
	{
		int n=nextInt();
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=nextInt();
		Arrays.sort(a,1,n+1);
		long ans=a[n];
		for(int i=3,c=n-1;i<=n;i+=2)
			ans+=2*a[c--];
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