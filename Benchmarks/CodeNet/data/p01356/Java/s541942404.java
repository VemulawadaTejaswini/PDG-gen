import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		long INF = 1000_000_000_000_000L;
		if (a == 1 && b == 1) {
			// (p+q)N
			long ans = INF;
			int div = m / (p + q);
			div = Math.min(div, n);
			ans = Math.min(ans, Math.abs(div * (p + q) - m));
			div = Math.min(div + 1, n);
			ans = Math.min(ans, Math.abs(div * (p + q) - m));
			System.out.println(ans);
			return;
		}
		// pa^k+qb^k
		int lim = 0;
		while (p * Math.pow(a, lim) + q * Math.pow(b, lim) <= INF) {
			++lim;
		}
		lim = Math.min(lim, n);
		ArrayList<Long> pending1 = new ArrayList<>();
		ArrayList<Long> pending2 = new ArrayList<>();
		for (int t = 0; t < 2; ++t) {
			int max = (t == 0 ? lim / 2 : (lim + 1) / 2);
			outer: for (long i = 0; i < (1L << max); ++i) {
				long s = 0;
				for (int j = 0; j < 20; ++j) {
					if ((i & (1L << j)) > 0) {
						s += p * Math.pow(a, j + (t == 1 ? lim / 2 : 0)) + q * Math.pow(b, j + (t == 1 ? lim / 2 : 0));
						if (s > INF)
							continue outer;
					}
				}
				if (t == 0)
					pending1.add(s);
				else
					pending2.add(s);
			}
		}

		Collections.sort(pending1);
		Collections.sort(pending2);

		long ans = m;
		for (int j = 0; j < 2; ++j) {
			int t = pending2.size() - 1;
			for (int i = 0; i < pending1.size(); ++i) {
				if (j == 0)
					while (t > 0 && pending1.get(i) + pending2.get(t) > m)
						--t;
				else if (j == 1)
					while (t > 0 && pending1.get(i) + pending2.get(t) >= m
							&& pending1.get(i) + pending2.get(t - 1) >= m)
						--t;
				ans = Math.min(ans, Math.abs(-m + pending1.get(i) + pending2.get(t)));
			}
		}

		System.out.println(ans);

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}