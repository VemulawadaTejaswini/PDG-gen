import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main
{
	static int MOD = (int) 1e9 + 7;
	
	static interface Solver
	{
		public void solve(int testNumber, MyScanner in, PrintWriter out);
	}
	
	public static void main(String[] args)
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Solver solver = new A();
		solver.solve(1, in, out);
		out.close();
	}
	
	static class F implements Solver
	{
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
		}
	}

	static class E implements Solver
	{
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
		}
	}

	static class D implements Solver
	{
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
		}
	}
	
	static class C implements Solver
	{
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
		}
	}
	
	static class B implements Solver
	{
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
		}
	}

	static class A implements Solver
	{
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
			int n = in.nextInt();
			int x = in.nextInt();
			int t = in.nextInt();
			out.println(Calc.ceilInt(n, x) * t);
		}
	}
	
	static class FenwickTree
	{
		// bit[1] ~ bit[n]
		long[] bit;   // = new long[n+1];
		
		public FenwickTree(int n)
		{
			bit = new long[n+1];
		}
		
		// bit[1] + ... + bit[r]
		long sum(int r)
		{
			long s = 0;
			for( int i=r; i>0; i-=(i & -i) )
			{
				s += bit[i];
			}
			return s;
		}
		
		void add(int idx, int x)
		{
			for( int i=idx; i<bit.length; i+=(i & -i) )
			{
				bit[i] += x;
			}
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
	
	static class Calc
	{
		static int gcd(int a, int b)
		{
			if( a == 0 )
			{
				return b;
			}
			return gcd(b%a, a);
		}
		
		static int ceilInt(int a, int b)
		{
			return (a%b==0 ? a/b : a/b+1);
		}

		static long power(long x, long n)
		{
			if( n == 0 )
			{
				return 1;
			}

			if( n % 2 == 0 )
			{
				long X = (x * x) % MOD;
				return power(X, n/2);
			}
			else
			{
				return (x * power(x, n-1)) % MOD;
			}
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
}
