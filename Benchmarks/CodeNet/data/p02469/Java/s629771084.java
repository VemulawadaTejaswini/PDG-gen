import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    long ans = 1;
    for (int i = 0; i < n; i++) {
      ans = lcm(ans, a[i]);
    }
    System.out.println(ans);
  }

  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static long lcm(long a, long b) {
    return (a / gcd(a, b)) * b;
  }
}
