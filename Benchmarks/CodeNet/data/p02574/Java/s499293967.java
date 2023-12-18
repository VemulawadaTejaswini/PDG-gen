import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		task.solve();
	}

	public static class Task {
		static final long MOD = (long) 1e9 + 7;

		static int gcd(int a, int b) {
			if (b == 0)
				return a;
			return gcd(b, a % b);
		}

		public void solve() {
			Scan sc = new Scan();
			int n = (int) sc.scanLong();
			int[] arr = new int[n];
			int _gcd = 0;
			int mx = 0;
			for (int i = 0; i < n; ++i) {
				int got = (int) sc.scanLong();
				arr[i] = got;
				_gcd = gcd(got, _gcd);
				mx = Math.max(got, mx);
			}
			if (_gcd == 1) {
				// check for pairwise coprime
				int[] isprime = new int[mx + 1];
				int[] lowest_factor = new int[mx + 1];
				for (long i = 2; i <= mx; i++) {
					if (isprime[(int) i] == 0) {
						lowest_factor[(int) i] = (int) i;
						for (long j = i * i; j <= mx; j += i) {
							isprime[(int) j] = 1;
							if (lowest_factor[(int) j] == 0)
								lowest_factor[(int) j] = (int) i;
						}
					}
				}
				boolean is_pairwise = true;
				Set<Integer> prime_factors = new HashSet<>();
				for (int num : arr) {
					while (num > 1) {
						int lowest_fac = lowest_factor[num];
						if (prime_factors.contains(lowest_fac)) {
							is_pairwise = false;
							break;
						}
						prime_factors.add(lowest_fac);
						while (num % lowest_fac == 0)
							num /= lowest_fac;
					}
					if (!is_pairwise)
						break;
				}
				if (is_pairwise)
					System.out.println("pairwise coprime");
				else
					System.out.println("setwise coprime");
			} else {
				System.out.println("not coprime");
			}
		}
	}

	public static class Scan {
		private byte[] buf = new byte[1024];
		private int index;
		private InputStream in;
		private int total;

		public Scan() {
			in = System.in;
		}

		public int scan() {
			if (total < 0)
				throw new InputMismatchException();
			if (index >= total) {
				index = 0;
				try {
					total = in.read(buf);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				if (total <= 0)
					return -1;
			}
			return buf[index++];
		}

		public long scanLong() {
			long integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}

		public double scanDouble() throws IOException {
			double doub = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n) && n != '.') {
				if (n >= '0' && n <= '9') {
					doub *= 10;
					doub += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			if (n == '.') {
				n = scan();
				double temp = 1;
				while (!isWhiteSpace(n)) {
					if (n >= '0' && n <= '9') {
						temp /= 10;
						doub += (n - '0') * temp;
						n = scan();
					} else
						throw new InputMismatchException();
				}
			}
			return doub * neg;
		}

		public String scanString() {
			StringBuilder sb = new StringBuilder();
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			while (!isWhiteSpace(n)) {
				sb.append((char) n);
				n = scan();
			}
			return sb.toString();
		}

		public char scanChar() {
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			return (char) n;
		}

		private boolean isWhiteSpace(int n) {
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
				return true;
			return false;
		}
	}
}
