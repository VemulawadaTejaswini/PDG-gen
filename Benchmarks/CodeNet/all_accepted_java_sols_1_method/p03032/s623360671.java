import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] vs = new long[n];
		for (int i = 0; i < n; i++) {
			vs[i] = sc.nextLong();
		}

		long a = 0;
		for (int l = 0; l <= k; l++) {
			for (int r = 0; r <= k - l; r++) {
				if (l + r > n) continue;
				int d = k - l - r;
				int current = 0;
				List<Long> s = new ArrayList<>();

				for (int i = 0; i < l; i++) {
					current += vs[i];
					s.add(vs[i]);
				}

				for (int i = 0; i < r; i++) {
					current += vs[(n - 1 - i)];
					s.add(vs[(n - 1 - i)]);
				}

				if (d > 0) {
					Collections.sort(s);
				}
				for (int i = 0; i < d; i++) {
					if (i >= s.size()) break;
					if (s.get(i) >= 0) break;
					current -= s.get(i);
				}

				a = Math.max(a, current);
			}
		}

		System.out.println(a);
	}
}
