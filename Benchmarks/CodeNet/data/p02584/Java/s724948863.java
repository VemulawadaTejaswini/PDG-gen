import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = Math.abs(sc.nextLong());
    long k = sc.nextLong();
    long d = sc.nextLong();
    if (k * (d + 1) < x) {
      System.out.println(Math.abs(x) - k * d);
    } else {
      long plus = x % d;
      long minus = Math.abs(plus - d);
      if (plus == 0) {
        System.out.println(minus);
      } else {
        System.out.println(Math.min(plus, minus));
      }
    }

  }
}
