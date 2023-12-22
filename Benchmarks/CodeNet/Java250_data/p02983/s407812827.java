import java.util.Scanner;

class Main {
  private static final int mod = 2019;
  private static void solve(long l, long r) {
    if (r - l >= 2018) {
      System.out.println(0);
      return;
    }
    Long min = null;
    for (long i = l; i <= r; i++) {
      for (long j = i + 1; j <= r; j++) {
        long m = (i * j) % mod;
        if (min == null || min > m) min = m;
      }
    }
    System.out.println(min);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long l = sc.nextLong();
    long r = sc.nextLong();
    solve(l, r);
  }
}