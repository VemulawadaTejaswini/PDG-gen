import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeMap<Integer, Integer> tm = new TreeMap<>(Comparator.reverseOrder());
		int a;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (tm.containsKey(a)) {
				tm.put(a, tm.get(a) + 1);
			} else {
				tm.put(a, 1);
			}
		}

		int b, c;
		for (int i = 0; i < m; i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			if (tm.containsKey(c)) {
				tm.put(c, tm.get(c) + b);
			} else {
				tm.put(c, b);
			}
		}
		long ans = 0;
		for (int i : tm.keySet()) {
			if (n - tm.get(i) > 0) {
				ans += (long) i * tm.get(i);
				n -= tm.get(i);
			} else {
				ans += (long) i * n;
				break;
			}
		}
		System.out.println(ans);
	}
}