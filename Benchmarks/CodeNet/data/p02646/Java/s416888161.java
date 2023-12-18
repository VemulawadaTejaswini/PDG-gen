import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws Exception
	{
		int a=nextInt();
		int v=nextInt();
		int b=nextInt();
		int w=nextInt();
		int t=nextInt();
		if(v<=w)
		{
			if(a==b)
				out.println("YES");
			else
				out.println("NO");
			return;
		}
		int time=(Math.abs(b-a)+v-w-1)/(v-w);
		if(time<=t)
			out.println("YES");
		else
			out.println("NO");
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