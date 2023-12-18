
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long[] kai = new long[5000001];
    kai[0] = 1;
    long MOD = (long)Math.pow(10, 9) + 7;
    for(long i = 1; i < 5000001; i++) {
      kai[(int)i] = (i * kai[(int)(i - 1)]) % MOD;
    }
    long ans = 0;
    for(int k = 0; k <= n; k++) {
      long t1 = kai[n];
      t1 = (t1 * func(kai[n - k], MOD - 2)) % MOD;
      t1 = (t1 * func(kai[k], MOD - 2)) % MOD;
      long t2 = kai[m];
      t2 = (t2 * func(kai[m - k], MOD - 2)) % MOD;
      long t3 = kai[m - k];
      t3 = (t3 * func(kai[m - n], MOD - 2)) % MOD;
      t3 = (t3 * t3) % MOD;
      long t = (t1 * t2) % MOD;
      t = (t * t3) % MOD;
      if((k % 2) == 0) {
        ans = (ans + t) % MOD;
      } else {
        ans = (ans - t + MOD) % MOD;
      }
    }
    System.out.println(ans);
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    if((x % 2) == 0) {
      long t = func(a, x / 2);
      return (t * t) % MOD;
    } else {
      return (a * func(a, x - 1)) % MOD;
    }
  }
}