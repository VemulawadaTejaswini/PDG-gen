import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static PrintWriter out;

	static HashMap<Integer, Integer> happyC;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] c = new int[m+1];
		for (int i = 0; i < n; i++) {
			int j = sc.nextInt();
			for (int j2 = 0; j2 < j; j2++) {
				c[sc.nextInt()]++;
			}
		}
		int ans = 0;
		for (int i = 0; i < m+1; i++) {
			if(c[i] == n )
				ans++;
		}
		out.println(ans);
		out.flush();	
	}
	
}
	
class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
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
