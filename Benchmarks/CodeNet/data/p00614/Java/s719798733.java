
class AOJ1028 {
	static final int[] c = { 1, 5, 10, 50, 100, 500 };

	public void run() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int P = sc.nextInt();
			if (P == 0)
				return;
			int[] N = new int[6];
			for (int i = 0; i < 6; i++)
				N[i] = sc.nextInt();
			int min = 10000;
			loop: for (int k = 0; k < 1 << 6; k++) {
				int n = 0;
				int p = P;
				for (int i = 5; i >= 0; i--)
					if (((1 << i) & k) == 0) {
						int dn = max((p - 1) / c[i] + 1, 0);
						if (p < 0 && i < 5 && (-p) % c[i + 1] / c[i] > 0) {
							dn = c[i + 1] / c[i] - (-p) % c[i + 1] / c[i];
							if (dn > N[i])
								continue loop;
						}
						dn = min(dn, N[i]);
						n += dn;
						p -= dn * c[i];
					}
				if (p > 0)
					continue;
				p = -p;
				for (int i = 5; i >= 0; i--) {
					n += p / c[i];
					p %= c[i];
				}
				min = min(min, n);
			}
			System.out.println(min);
		}
	}
}

public class Main {
	public static void main(String... args) {
		new AOJ1028().run();
	}

	public static void debug(Object... os) {
		System.err.println(java.util.Arrays.deepToString(os));
	}
}

class Scanner {
	final java.util.Scanner sc;

	public double nextDouble() {
		return Double.parseDouble(sc.next());
	}

	public Scanner(java.io.InputStream is) {
		this.sc = new java.util.Scanner(is);
	}

	public boolean hasNext() {
		return sc.hasNext();
	}

	public String next() {
		return sc.next();
	}

	public int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public String nextLine() {
		return sc.nextLine();
	}

	public long nextLong() {
		return Long.parseLong(sc.next());
	}
}