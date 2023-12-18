import java.util.*;

/**
 * E Main
 *
 * @date 2020.09.19
 * @author 焼き鮭 <yaki-shake@up-tri.me>
 */

public class Main {
  Scanner sc;

  public static void main(String[] args) {
    new Main().execute();
  }

  public void execute() {
    this.sc = new Scanner(System.in);

    long n = sc.nextLong();
    int x = sc.nextInt();
    int m = sc.nextInt();

    long sum = 0;
    for (long i = 1; i <= n; i++) {
      sum += modpow(x, modpow(2, i - 1, m), m) % m;
    }

    System.out.println(sum);
  }

  public long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if ((n & 1) != 0) {
        res = res * a % mod;
      }
      a = a * a % mod;
      n >>= 1;
    }
    return res;
  }
}
