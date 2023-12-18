import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) nodes[i] = new Node();
		for (int i = 0; i < n; i++) {
			nodes[i].next = nodes[(i + 1)%n];
			nodes[i].prev = nodes[(i - 1 + n)%n];
		}

		Node cur = nodes[0];
		for (int mmm = 0; mmm < m; mmm++) {
			int a = sc.nextInt();
			if (a % 2 == 0) {
				for (int i = 0; i < a; i++) cur = cur.next;
			} else {
				for (int i = 0; i < a; i++) cur = cur.prev;
			}
			cur.live = false;
			cur.prev.next = cur.next;
			cur.next.prev = cur.prev;
			cur = cur.next;
		}
		for (int qqq = 0; qqq < q; qqq++) {
			int x = sc.nextInt();
			System.out.println(nodes[x].live ? 1 : 0);
		}

	}

	class Node {
		boolean live = true;
		Node prev;
		Node next;
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}