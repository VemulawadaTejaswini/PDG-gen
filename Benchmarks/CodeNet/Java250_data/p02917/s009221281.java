import java.io.*;
import java.util.*;
 
 
public class Main {
	public static void main(String[] args) throws Exception {
		MScanner sc=new MScanner(System.in);
		//MScanner sc=new MScanner("portals.in");
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt();
		int[]a=new int[n-1];
		for(int i=0;i<n-1;i++) {
			a[i]=sc.nextInt();
		}
		int sum=a[0]+a[n-2];
		for(int i=0;i<a.length-1;i++) {
			sum+=Math.min(a[i], a[i+1]);
		}
		pw.println(sum);
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