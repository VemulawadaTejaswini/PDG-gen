import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Solver solver = new C();
		solver.solve(1, in, out);
		out.close();
	}
	
	static class C implements Solver
	{
		long mod = (long) 1e9 + 7;

		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
			long n = in.nextLong();
			long ans = power(10, n) - 2 * power(9, n) + power(8, n);
			while( ans < 0 )
			{
				ans += mod;
			}
			while( ans >= mod )
			{
				ans -= mod;
			}
			out.println(ans);
		}
		
		long power(long x, long n)
		{
			if( n == 0 )
			{
				return 1;
			}

			if( n % 2 == 0 )
			{
				long X = (x * x) % mod;
				return power(X, n/2);
			}
			else
			{
				return (x * power(x, n-1)) % mod;
			}
		}
	}
	
	static class B implements Solver
	{
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
			long a = in.nextInt();
			long b = in.nextInt();
			long c = in.nextInt();
			long d = in.nextInt();
			out.println(Math.max(Math.max(a*c, a*d), Math.max(b*c, b*d)));
		}
	}

	static class A implements Solver
	{
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
			int x = in.nextInt();
			out.println(1 - x);
		}
	}

	static class UnionFind
	{
		int[] par;
		int[] n_nodes;
		int max = 1;
		
		public UnionFind(int n)
		{
			par = new int[n];
			n_nodes = new int[n];
			for( int i=0; i<n; i++ )
			{
				par[i] = i;
				n_nodes[i] = 1;
			}
		}
		
		int root(int x)
		{
			if( par[x] == x ) return x;
			return par[x] = root(par[x]);
		}
		
		void unite(int x, int y)
		{
			int rx = root(x);
			int ry = root(y);
			if( rx == ry ) return;
			par[rx] = ry;
			n_nodes[ry] += n_nodes[rx];
			max = Math.max(max, n_nodes[ry]);
		}
		
		boolean same(int x, int y)
		{
			int rx = root(x);
			int ry = root(y);
			return rx == ry;
		}
	}
	
	static class MyScanner
	{
		private BufferedReader in;
		private StringTokenizer st;
		
		public MyScanner(InputStream stream)
		{
			in = new BufferedReader(new InputStreamReader(stream));
		}
		
		public String next()
		{
			while( st == null || !st.hasMoreTokens() )
			{
				try
				{
					String rl = in.readLine();
					if( rl == null )
					{
						return null;
					}
					st = new StringTokenizer(rl);
				}
				catch( IOException e )
				{
					return null;
				}
			}
			return st.nextToken();
		}
		
		public int nextInt()
		{
			return Integer.parseInt(next());
		}
		
		public long nextLong()
		{
			return Long.parseLong(next());
		}
	}
	
	static interface Solver
	{
		public void solve(int testNumber, MyScanner in, PrintWriter out);
	}
}
