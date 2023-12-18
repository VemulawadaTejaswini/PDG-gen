import java.util.*;
import java.io.*;

public class Main {
	static FastReader f = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		//int t = f.nextInt();
		//while(t-- > 0)
			solve();
		out.close();
	}

	static void solve() {
		int n = f.nextInt(), m = f.nextInt();

		Dsu dsu = new Dsu(n);
		while(m-- > 0) {
			dsu.join(f.nextInt() - 1, f.nextInt() - 1);
		}

		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(dsu.getPar(i));
		}

		out.println(set.size() - 1);
	}

	static class Dsu {
		int[] size;
		int[] par; 
		Dsu(int n) {
			size = new int[n];
			par = new int[n];
			for(int i=0;i<n;i++) {
				size[i] = 1;
				par[i] = i;
			}
		}

		int getPar(int x) {
			if(x == par[x]) {
				return x;
			}
			return par[x] = getPar(par[x]);
		}


		void join(int a, int b) {
			a = getPar(a);
			b = getPar(b);
			if(a != b) {
				if(size[a] < size[b]) {
					int t = a;
					a = b;
					b = t;
				}
				size[a] += size[b];
				par[b] = a;
			}
		}
 	}


	static class FastReader {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine() {
			String s = "";
			try {
				s = br.readLine();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}

			return s;
		}

		int  nextInt() {
			return Integer.parseInt(next());
		}

		long  nextLong() {
			return Long.parseLong(next());
		}
	}
}