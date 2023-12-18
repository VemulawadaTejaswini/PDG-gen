import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = Math.abs(sc.nextLong());
    long k = sc.nextLong();
    long d = sc.nextLong();
    if (x - k * d >= 0) {
      System.out.println(x - k * d);
    } else {
      long plus = x % d;
      long minus = plus - d;
      long count = x / d;
      if ((k - count) % 2 == 0) {
        System.out.println(plus);
      } else {
        System.out.println(Math.abs(minus));
      }
    }
  }
}
