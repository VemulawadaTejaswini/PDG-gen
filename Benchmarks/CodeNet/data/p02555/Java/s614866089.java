import java.util.Scanner;

public class Main {
	private static final int MOD = 1000000007;

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.nextInt();
		sc.close();

		var calc = new Main().new ModCalc(MOD);
		var a = new int[s + 1];
		a[0] = 1;
		for (var i = 0; i < s + 1; i++) {
			for (var j = 3; j <= i; j++) {
				a[i] = calc.add(a[i], a[i - j]);
			}
		}
		System.out.println(a[s]);
	}

	public class ModCalc {
		int mod;

		public ModCalc(int mod) {
			this.mod = mod;
		}

		public int add(int a, int b) {
			return (int) (((long) a + b) % mod);
		}

		public int subtract(int a, int b) {
			return (int) (((long) a - b + mod) % mod);
		}

		public int multiply(int a, int b) {
			return (int) (((long) a * b) % mod);
		}

		public int divide(int a, int b) {
			return multiply(a, pow(b, mod - 2));
		}

		public int pow(int n, int k) {
			if (k == 0) {
				return 1;
			} else if (k % 2 == 0) {
				int p = pow(n, k / 2);
				return multiply(p, p);
			} else {
				int p = pow(n, (k - 1) / 2);
				return multiply(multiply(p, p), n);
			}
		}

		public int combine(int n, int k) {
			int sum1 = 1;
			int sum2 = 1;
			for (int i = 0; i < k; i++) {
				sum1 = multiply(sum1, n - i);
				sum2 = multiply(sum2, i + 1);
			}
			return divide(sum1, sum2);
		}
	}
}
