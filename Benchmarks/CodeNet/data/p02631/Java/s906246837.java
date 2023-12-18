import java.io.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt(), arr[] = new int[n], xor = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			xor ^= arr[i];
		}
		
		for(int i = 0; i < n; i++) {
			out.print((arr[i] ^ xor) + " ");
		}
		
		out.close();
	}

}

class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}

	public Scanner(String file) throws Exception {
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

	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}