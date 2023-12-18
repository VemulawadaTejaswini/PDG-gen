import java.io.*;
import java.util.*;

public class Main{
	static void main() throws Exception{
		int n=sc.nextInt(),k=sc.nextInt();
		int[][]segs=new int[k][2];
		for(int i=0;i<k;i++) {
			segs[i]=sc.intArr(2);
		}
		int mod=998244353;
		long[]ans=new long[n];
		ans[n-1]=1;
		long[]suff=new long[n+1];
		suff[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			for(int[]seg:segs) {
				if(i+seg[0]>=n)continue;
				int l=i+seg[0],r=Math.min(n-1, i+seg[1]);
				long ways=(suff[l]-suff[r+1]+mod)%mod;
				ans[i]=(ans[i]+ways)%mod;
			}
			suff[i]=(ans[i]+suff[i+1])%mod;
		}
		pw.println(ans[0]);
	}
	public static void main(String[] args) throws Exception {
		sc = new MScanner(System.in);
		pw = new PrintWriter(System.out);
//		int tc = 1;
//		tc=sc.nextInt();
//		while (tc-- > 0)
			main();
		pw.flush();
	}

	static PrintWriter pw;
	static MScanner sc;

	static class MScanner {
		StringTokenizer st;
		BufferedReader br;

		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int[] intArr(int n) throws IOException {
			int[] in = new int[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public long[] longArr(int n) throws IOException {
			long[] in = new long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public int[] intSortedArr(int n) throws IOException {
			int[] in = new int[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			shuffle(in);
			Arrays.sort(in);
			return in;
		}

		public long[] longSortedArr(int n) throws IOException {
			long[] in = new long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			shuffle(in);
			Arrays.sort(in);
			return in;
		}

		public Integer[] IntegerArr(int n) throws IOException {
			Integer[] in = new Integer[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public Long[] LongArr(int n) throws IOException {
			Long[] in = new Long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}

	static void shuffle(int[] in) {
		for (int i = 0; i < in.length; i++) {
			int idx = (int) (Math.random() * (i + 1));
			int tmp = in[i];
			in[i] = in[idx];
			in[idx] = tmp;
		}
	}

	static void shuffle(long[] in) {
		for (int i = 0; i < in.length; i++) {
			int idx = (int) (Math.random() * (i + 1));
			long tmp = in[i];
			in[i] = in[idx];
			in[idx] = tmp;
		}
	}
}