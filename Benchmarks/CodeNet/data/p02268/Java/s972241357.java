import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n, m;
	static int[] a, b;
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		m = Integer.parseInt(sc.next());
		b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(a);
		Arrays.sort(b);
		solve();
		System.out.println(count);
	}

	static void solve() {
		int l = 0;
		int r = n - 1;
		int t, at;

		for (int i = 0; i < m; i++) {
			t = b[i];
			at = search(l, r, t);
			if (at == -1)
				continue;
			count++;
			l = at = 1;
		}
	}

	static int search(int l, int r, int t) {
		while (l <= r) {
			int mid = (l + r) / 2;
			if (a[mid] == t)
				return t;
			if (a[mid] < t)
				return search(mid + 1, r, t);
			if (a[mid] > t)
				return search(l, mid - 1, t);
		}
		return -1;
	}
}

