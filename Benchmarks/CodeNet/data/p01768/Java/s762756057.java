import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

public class Main {
	int[] cost;
	List<Integer>[] e;
	boolean[] vis;

	int[] dfs(int k) {
		if (vis[k]) {
			return null;
		}
		vis[k] = true;

		int min = cost[k];
		int cost = 1;
		for (Integer to : e[k]) {
			int[] tmp = dfs(to);
			if (tmp == null) {
				continue;
			}
			min = Math.min(min, tmp[0]);
			cost += tmp[1];
		}
		return new int[] { min, cost };
	}

	@SuppressWarnings("unchecked")
	void run() {
		MyScanner sc = new MyScanner();

		int n = sc.nextInt();
		String[] name = new String[n];
		cost = new int[n];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			name[i] = sc.next();
			cost[i] = sc.nextInt();
			map.put(name[i], i);
		}
		e = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			e[i] = new LinkedList<Integer>();
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			String u = sc.next();
			String v = sc.next();
			int s = map.get(u);
			int t = map.get(v);
			e[s].add(t);
			e[t].add(s);
		}
		
		vis = new boolean[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (vis[i]) {
				continue;
			}
			int[] tmp = dfs(i);
			sum += tmp[0] * tmp[1];
		}
		
		System.out.println(sum);
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