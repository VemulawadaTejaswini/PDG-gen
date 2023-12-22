import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;







public class Main{
	public static int n;
	public static boolean[] vis;
	public static int[] nums;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] a = new int[n][d];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				a[i][j] = sc.nextInt(); 
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int sum= 0;
				for (int j2 = 0; j2 < d; j2++) {
					sum+= (a[j][j2]-a[i][j2])*(a[j][j2]-a[i][j2]);
				}
				if (Math.sqrt(sum) == Math.ceil(Math.sqrt(sum))) {
					ans++;
				}
			}
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