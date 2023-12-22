import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = os.nextInt();
		String s = os.next();
		
		char a = 'A';
		StringBuilder sb = new StringBuilder(); 
		for (int i = 0; i <= ('Z' - 'A'); i++) {
			sb.append(a++);
		}
		String str = sb.toString();
		sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int it = str.indexOf(s.charAt(i)) + n;
			it = it > (str.length() - 1) ? it - str.length() : it;
			sb.append(str.charAt(it));
		}
		pw.println(sb.toString());
		pw.close();
	}
	
	static class OriginScanner {
		private BufferedReader br;
		private StringTokenizer st;
		
		public OriginScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextLine() {
			String str = null;
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				System.out.println(e);
			}
			return str;
		}
		String next() {
			if (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(nextLine());
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
