import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long MOD = 1000000007;
    long n = sc.nextLong();
    long m = sc.nextLong();
    long[] x = new long[(int)n];
    long[] y = new long[(int)m];
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextLong();
    }
    for(int i = 0; i < m; i++) {
      y[i] = sc.nextLong();
    }
    long prod1 = 0;
    long prod2 = 0;
    for(int i = 1; i <= n; i++) {
      prod1 = (prod1 + ((2 * i - n - 1) * x[i - 1])) % MOD;
    }
    for(int i = 1; i <= m; i++) {
      prod2 = (prod2 + ((2 * i - m - 1) * y[i - 1])) % MOD;
    }
    System.out.println((prod1 * prod2) % MOD);
  }
}