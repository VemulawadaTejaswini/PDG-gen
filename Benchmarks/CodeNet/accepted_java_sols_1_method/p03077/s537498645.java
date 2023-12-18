import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    long e = sc.nextLong();
    long ans = 4;
    long m = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
    long s = (n / m) + 1;
    if((n % m) == 0) s = (n / m);
    ans += s;
    System.out.println(ans);
  }
}