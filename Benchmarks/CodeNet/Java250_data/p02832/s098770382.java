import java.io.*;
import java.util.*;
public class Main {
	public static class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
	}

	public static long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }
	public static long lcm(long a, long b) { return a * b / gcd(a, b); }
	public static int abs(int x) { if (x < 0) return -x; return x; }

	public static void main(String[] args) {
		FS in = new FS();

		HashMap<Integer, TreeSet<Integer>> map;
		map = new HashMap<>();

		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			map.putIfAbsent(a, new TreeSet<>());
			map.get(a).add(i);
			map.get(a).add(n + 1);
		}

		int k = 0, l = -1;
		while (true) {
			if (!map.containsKey(k + 1))
				break;
			if (map.get(k + 1).higher(l) != (n + 1)) {
				l = map.get(k + 1).higher(l);
				k++;
			}
			else
				break;
		}
	
		int ans = n - k;
		if (l == -1)
			ans = l;

		System.out.println(ans);
	}
}
