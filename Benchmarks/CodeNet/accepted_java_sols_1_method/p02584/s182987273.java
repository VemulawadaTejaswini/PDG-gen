import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = Math.abs(sc.nextLong());
    long k = sc.nextLong();
    long d = sc.nextLong();
    if (x / d > k) {
      System.out.println(x - k * d);
    } else {
      long plus = x % d;
      long minus = plus - d;
      long count = k - (x / d);
      if (count % 2 == 0) {
        System.out.println(plus);
      } else {
        System.out.println(Math.abs(minus));
      }
    }
  }
}
