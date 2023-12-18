import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		D solver = new D();
		solver.solve(1, in, out);
		out.close();
	}
	
	static class UnionFind
	{
		int[] par;
		int[] n_nodes;
		int max;
		
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
	
	static class D
	{
		public void solve(int n, MyScanner in, PrintWriter out)
		{
			int N = in.nextInt();
			int M = in.nextInt();
			UnionFind tree = new UnionFind(N);
			for( int i=0; i<M; i++ )
			{
				int a = in.nextInt();
				int b = in.nextInt();
				tree.unite(a-1, b-1);
			}
			out.println(tree.max);
		}
	}
	
	static class C
	{
		public void solve(int n, MyScanner in, PrintWriter out)
		{
			int mod = (int) 1e9 + 7;
			
			int N = in.nextInt();
			int[] a = new int[N];
			long sum = 0;
			for( int i=0; i<N; i++ )
			{
				a[i] = in.nextInt();
				sum += a[i];
			}
			long ans = 0;
			for( int i=0; i<N; i++ )
			{
				sum -= a[i];
				long add = ((sum % mod) * a[i]) % mod;
				ans = (ans + add) % mod;
			}
			out.println(ans);
		}
	}
	
	static class B
	{
		public void solve(int n, MyScanner in, PrintWriter out)
		{
			String S = in.next();
			String T = in.next();

			char[] s = S.toCharArray();
			char[] t = T.toCharArray();
			
			int min = t.length;
			for( int i=0; i<=s.length - t.length; i++ )
			{
				int cnt = 0;
				for( int j=0; j<t.length; j++ )
				{
					if( s[i+j] != t[j] ) cnt++;
				}
				min = Math.min(min, cnt);
			}
			out.println(min);
		}
	}
	
	static class A
	{
		int D;
		int T;
		int S;
		
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
			D = in.nextInt();
			T = in.nextInt();
			S = in.nextInt();
			out.println(D <= T*S ? "Yes" : "No");
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
	}
}
