import java.io.*;
import java.util.*;
import java.awt.Point;
public class Main {
	static Scanner sc;
	static PrintWriter out;
	static final int uncal = -1;
	static final int mod = (int) (1e9)+7;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in); 
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[] a= new int[4];
		String[] as = {"AC", "WA", "TLE", "RE"};
		while(n-->0) {
			String verdict = sc.nextLine();
			switch(verdict) {
				case "AC":
					a[0]++;
					break;
				case "WA":
					a[1]++;
					break;
				case "TLE":
					a[2]++;
					break;
				default:
					a[3]++;
			}			
		}
		for (int i = 0; i < 4; i++) {
			out.printf("%s x %d\n", as[i], a[i]);
		}
		out.close();
	}
	static class Scanner{
		private BufferedReader br;
		private StringTokenizer st;
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		public Scanner(String filename) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(filename));
		}
		public String next() throws IOException{
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
		public int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException{
			return Long.parseLong(next());
		}
		public double nextDouble() throws IOException{
			return Double.parseDouble(next());
		}
		public int[] inArr(int n) throws Exception{
			int a [] = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				a[i] = Integer.parseInt(next());
			}
			return a;
		}
	}

}