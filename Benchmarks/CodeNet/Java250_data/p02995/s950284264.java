import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    long A = in.nextLong(), B = in.nextLong(), C = in.nextLong(), D = in.nextLong();
    System.out.println((B - A + 1) - calc(A, B, C) - calc(A, B, D) + calc(A, B, lcm(C, D)));
  }

  public static long calc(long a, long b, long c) {
    return b / c - (a - 1) / c;
  }

  public static long gcd(long x, long y) {
    return y == 0 ? x : gcd(y, x % y);
  }

  public static long lcm(long x, long y) {
    return x * (y / gcd(x, y));
  }
}