import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long d = b - a;
    long ans = 0;
    for(long i = 1; i < d; i++) {
      ans += i;
    }
    ans -= a;
    System.out.println(ans);
  }
}
