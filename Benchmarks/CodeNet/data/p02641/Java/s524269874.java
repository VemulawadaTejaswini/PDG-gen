import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws Exception
	{
		int x=nextInt();
		int n=nextInt();
		TreeSet<Integer> set=new TreeSet<>();
		for(int i=0;i<=101;i++)
			set.add(i);
		for(int i=1;i<=n;i++)
			set.remove(nextInt());
		if(set.contains(x))
			out.println(x);
		else
		{
			int low=set.lower(x);
			int high=set.higher(x);
			if(Math.abs(x-high)<Math.abs(x-low))
				out.println(high);
			else
				out.println(low);
		}
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