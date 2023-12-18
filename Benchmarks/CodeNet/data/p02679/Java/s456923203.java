import java.util.*;

public class Main {
  private static final int MOD = 1_000_000_007;
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    Map<String, Integer> pos = new HashMap<>();
    Map<String, Integer> neg = new HashMap<>();
    for (int i = 0; i < n; i++) {
      boolean isPos = true;
      long a = input.nextLong();
      long b = input.nextLong();
      if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
        isPos = false;
      }

      a = Math.abs(a); b = Math.abs(b);
      long gcd = (a < b) ? gcd(b, a) : gcd(a, b);
      a /= gcd; b /= gcd;

      if (isPos) {
       	pos.merge(a + "/" + b, 1, Integer::sum);
      } else {
        neg.merge(a + "/" + b, 1, Integer::sum);
      }
    }

    long ans = 1;
    for (Map.Entry<String, Integer> e : pos.entrySet()) {
      String[] tok = e.getKey().split("/");
	  String key = tok[1] + "/" + tok[0];
      long value = pow(e.getValue());

      if (neg.containsKey(key)) {
        value += pow(neg.get(key)) - 1;
		value %= MOD;
        neg.remove(key);
      }

      ans *= value;
      ans %= MOD;
    }

    for (int value : neg.values()) {
      ans *= pow(value);
      ans %= MOD;
    }

    System.out.println(ans - 1);
  }

	private static long pow(int value) {
		if (value == 0) return 1;
		if (value == 1) return 2;

		long res = pow(value / 2);

		res *= res;
		res %= MOD;
		if (value % 2 == 1) {
			res *= value;
			res %= MOD;
		}

		return res;
	}

  private static long gcd(long m, long n) {
    return n == 0 ? m : gcd(n, m % n);
  }
}