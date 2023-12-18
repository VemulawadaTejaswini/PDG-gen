import java.util.*;
import java.io.*;

public class Main {
	public void solve() throws IOException {
		int n = nextInt();
		int[] v = new int[n+1];
		for(int i = 0; i < n; i++){
			int a = nextInt();
			int x = nextInt();
			v[a] += x;
		}
		int ans = 1;
		for(int i = 1; i <= n; i++){
			if( v[i] > v[ans] ){
				ans = i;
			}
		}
		writer.println(ans + " " + v[ans]);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;

	public void run() throws IOException {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String nextToken() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}
}