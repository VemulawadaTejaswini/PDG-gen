import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var x = sc.next();
		sc.close();

		var count = (int) IntStream.range(0, n).filter(i -> x.substring(i, i + 1).equals("1")).count();
		var modCalc1 = new Main().new ModCalc(count - 1);
		var modCalc2 = new Main().new ModCalc(count + 1);
		var sum1 = 0;
		var sum2 = 0;
		if (count - 1 > 0) {
			for (var i = x.length() - 1; i >= 0; i--) {
				if (x.substring(i, i + 1).equals("1")) {
					sum1 = modCalc1.add(sum1, (int) modCalc1.pow(2, x.length() - 1 - i));
					sum2 = modCalc2.add(sum2, (int) modCalc2.pow(2, x.length() - 1 - i));
				}
			}
		}

		var map = new HashMap<Integer, Integer>();
		for (var i = 0; i < n; i++) {
			var result = 0;
			var bit = x.substring(i, i + 1).equals("1");
			if (!(bit && count == 1)) {
				var fc = 0;
				if (bit) {
					fc = modCalc1.subtract(sum1, modCalc1.pow(2, x.length() - 1 - i));
				} else {
					fc = modCalc2.add(sum2, modCalc2.pow(2, x.length() - 1 - i));
				}
				result++;
				while (fc > 0) {
					fc = f(fc, map);
					result++;
				}
			}
			System.out.println(result);
		}
	}

	private static int f(int n, HashMap<Integer, Integer> map) {
		if (map.containsKey(n)) {
			return map.get(n);
		}

		var count = 0;
		var bits = new Main().new BitConv().getBits(n);
		for (var i = 0; i < bits.length; i++) {
			if (bits[i]) {
				count++;
			}
		}
		var result = n % count;
		map.put(n, result);
		return result;
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
	}

	public class BitConv {
		public boolean[] getBits(int n) {
			var bits = new boolean[32];
			for (int i = 0; i < 32; i++) {
				bits[i] = getBit(n, i);
			}
			return bits;
		}

		public int getInt(boolean[] bits) {
			var value = 0;
			for (int i = 0; i < 32; i++) {
				value += bits[i] ? Math.pow(2, i) : 0;
			}
			return value;
		}

		public boolean getBit(int n, int d) {
			return ((n % (int) Math.pow(2, d + 1)) / ((int) Math.pow(2, d))) != 0;
		}
	}
}
