import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long ans = 0;
    for(long b = 1; b <= n; b++) {
      long r = n % b;
      long t = n / b;
      ans += (t * Math.max(0, (b - k)));
      ans += Math.max(0, r - k + 1);
    }
    if(k == 0) ans -= n;
    System.out.println(ans);
  }
}