import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Main {
	int n;
	List<Integer>[] e;
	boolean[] vis;

	int dfs(int k) {
		if (vis[k]) {
			return 0;
		}
		vis[k] = true;
		if (e[k].size() == 0) {
			return 1;
		}
		int sum = 0;
		for (Integer to : e[k]) {
			sum += dfs(to);
		}
		return sum;
	}

	@SuppressWarnings("unchecked")
	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int id = 0;
			TreeMap<String, Integer> map = new TreeMap<String, Integer>();
			String[] source = new String[n];
			String[][] sink = new String[n][];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				s = s.substring(0, s.length() - 1);
				String[] u = s.split(":");
				String[] v = u[1].split(",");
				source[i] = u[0];
				sink[i] = new String[v.length];
				for (int j = 0; j < v.length; j++) {
					sink[i][j] = v[j];
				}

				if (map.get(u[0]) == null) {
					map.put(u[0], id++);
				}
				for (int j = 0; j < v.length; j++) {
					if (map.get(v[j]) == null) {
						map.put(v[j], id++);
					}
				}
			}

			e = new LinkedList[id];
			for (int i = 0; i < id; i++) {
				e[i] = new LinkedList<Integer>();
			}

			for (int i = 0; i < n; i++) {
				int u = map.get(source[i]);
				for (int j = 0; j < sink[i].length; j++) {
					int v = map.get(sink[i][j]);
					e[u].add(v);
				}
			}

			vis = new boolean[id];
			System.out.println(dfs(0));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}