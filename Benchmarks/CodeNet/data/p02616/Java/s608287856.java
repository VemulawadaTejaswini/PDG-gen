import java.io.*;
import java.util.*;
public class Main
{
	final long mod=(long)(1e9+7);
	private void solve()throws Exception
	{
		int n=nextInt();
		int k=nextInt();
		ArrayList<Integer> pos=new ArrayList<>();
		ArrayList<Integer> neg=new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			int a=nextInt();
			if(a>=0)
				pos.add(a);
			else
				neg.add(-a);
		}
		Collections.sort(pos);
		Collections.sort(neg);
		Collections.reverse(pos);
		Collections.reverse(neg);
		//prod[i] is the prod of first i pos elements
		long prod[]=new long[pos.size()+1];
		prod[0]=1;
		for(int i=1;i<=pos.size();i++)
			prod[i]=(pos.get(i-1)*prod[i-1])%mod;
		if(pos.size()==0 && k%2==1)
		{
			long ans=1;
			for(int i=neg.size()-1;i>=neg.size()-k;i--)
				ans=(ans*((mod-neg.get(i))%mod))%mod;
			out.println(ans);
		}
		else
		{
			long ans=0;
			long negprod=1;
			for(int i=0;i<=neg.size();i+=2)//taking i neg elements
			{
				if(k-i>=0)
				{
					long curr=(prod[k-i]*negprod)%mod;
					ans=Math.max(ans,curr);
				}
				if(i+1>=neg.size())
					break;
				negprod=(negprod*((mod-neg.get(i))%mod))%mod;
				negprod=(negprod*((mod-neg.get(i+1))%mod))%mod;
			}
			out.println(ans);
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