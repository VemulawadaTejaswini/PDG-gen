import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class Main {
	static int[]v;
	static int c[];
	static int ans=0;
	static void solve(int i,int val,int cost) {
		ans=Math.max(ans,val-cost);
		if(i>=v.length)return;
		solve(i+1,val,cost);solve(i+1,val+v[i],cost+c[i]);
	}
	public static void main(String[] args) throws IOException {
		MScanner sc = new MScanner(System.in);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt();
		v=new int[n];c=new int[n];
		for(int i=0;i<n;i++)v[i]=sc.nextInt();
		for(int i=0;i<n;i++)c[i]=sc.nextInt();
		solve(0,0,0);
		pw.println(ans);
		pw.close();
		pw.flush();
 
	}

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
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}