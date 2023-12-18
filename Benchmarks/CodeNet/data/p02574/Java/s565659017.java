import java.io.*;
import java.util.*;

public class Main {

	static int gcd(int a,int b) {
		return b==0?a:gcd(b,a%b);
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt();
		int N=(int)1e6+5;
		int[]cnt=new int[N];
		int gcd=0;
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			gcd=gcd(gcd,x);
			cnt[x]++;
		}
		boolean all=true;
		boolean[] isPrime=new boolean[N];
		Arrays.fill(isPrime, true);
		for(int i=2;i<N;i++)
			if(isPrime[i]) {
				int curr=0;
				for(int j=i;j<N;j+=i) {
					curr+=cnt[j];
					isPrime[j]=false;
				}
				all&=curr<2;
				
			}
		out.println(all?"pairwise coprime":gcd==1?"setwise coprime":"not coprime");
		out.close();

	}

	static class DSU {
		int[] p, r;

		DSU(int n) {
			p = new int[n];
			r = new int[n];
			for (int i = 0; i < n; i++)
				p[i] = i;
		}

		boolean union(int x, int y) {
			x = findSet(x);
			y = findSet(y);
			if (x == y)
				return false;
			if (r[x] > r[y]) {
				p[y] = x;
			} else {
				p[x] = y;
				if (r[x] == r[y])
					r[y]++;
			}
			return true;

		}

		int findSet(int x) {
			if (p[x] == x)
				return x;
			else
				return p[x] = findSet(p[x]);
		}
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready() || st.hasMoreTokens();
		}

		int[] nxtArr(int n) throws IOException {
			int[] ans = new int[n];
			for (int i = 0; i < n; i++)
				ans[i] = nextInt();
			return ans;
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}