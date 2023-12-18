
import java.io.*;
import java.util.*;

public class Main{

	static int mod = 1000000007;

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x < 0)
				neg.add(x);
			else
				pos.add(x);
		}
		long ans = 1;
		Collections.sort(pos);
		Collections.sort(neg);
		int i = 0;
		int j = pos.size() - 1;
		if (k % 2 == 0 || pos.size() >= k) {
			while (k >= 1) {
				if (k == 1) {
					ans = mul(ans, pos.get(j));
					break;
				}
				k -= 2;
				if (neg.size() - i > 1
						&& (j < 1 || neg.get(i) * 1l * neg.get(i + 1) > pos.get(j) * 1l * pos.get(j - 1))) {
					ans = mul(ans, mul(neg.get(i), neg.get(i + 1)));
					i += 2;
				} else {
					ans = mul(ans, mul(pos.get(j), pos.get(j - 1)));
					j -= 2;
				}
			}

		} else {
			i = neg.size() - 1;
			j = 0;
			while (k > 0) {
				k--;
				if (i >= 0) {
					if ((pos.size() - j > 0)) {
						if (-neg.get(i) < pos.get(j))
							ans = mul(ans, neg.get(i--));
						else
							ans = mul(ans, pos.get(j++));
					} else
						ans = mul(ans, neg.get(i--));
				} else
					ans = mul(ans, pos.get(j++));

			}
		}
		System.out.println(mod(ans));

	}

	static long mod(long ans) {
		if (ans < 0)
			return (ceil(-ans, mod) * 1l * mod + ans);
		else
			return (ans % mod);

	}

	static long mul(long x, long y) {
		return mod(mod(x) * mod(y));
	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}

	public static int log(int n, int base) {
		int ans = 0;
		while (n + 1 > base) {
			ans++;
			n /= base;
		}
		return ans;
	}

	static int pow(int b, long e) {
		int ans = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				ans = (int) ((ans * 1l * b));
			e >>= 1;
			{

			}
			b = (int) ((b * 1l * b));
		}
		return ans;
	}

	static int powmod(int b, long e, int mod) {
		int ans = 1;
		b %= mod;
		while (e > 0) {
			if ((e & 1) == 1)
				ans = (int) ((ans * 1l * b) % mod);
			e >>= 1;
			b = (int) ((b * 1l * b) % mod);
		}
		return ans;
	}

	static class pair implements Comparable<pair> {
		int x, y;

		pair(int s, int d) {
			x = s;
			y = d;
		}

		@Override
		public int compareTo(pair p) {
			return (x == p.x && y == p.y) ? 0 : 1;
		}

		@Override
		public String toString() {
			return x + " " + y;

		}
	}

	static int ceil(int a, int b) {
		int ans = a / b;
		return a % b == 0 ? ans : ans + 1;
	}

	static long ceil(long a, long b) {
		long ans = a / b;
		return a % b == 0 ? ans : ans + 1;
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public int[] intArr(int n) throws IOException {
			int a[] = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
			return a;
		}

		public long[] longArr(int n) throws IOException {
			long a[] = new long[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
			return a;
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}

	public static void shuffle(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			int tmp = a[i];
			a[i] = a[r];
			a[r] = tmp;
		}
	}

}