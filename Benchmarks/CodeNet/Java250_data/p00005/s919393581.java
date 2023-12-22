import java.util.Scanner;
public class Main {
  public static long gcd (long a, long b) {
    if (b%a == 0) {
      return a;
    }
    else return gcd(b%a, a);
  }
  public static void main (String [] args) {
    Scanner s = new Scanner (System.in);
    while (s.hasNextLong()) {
      long a = s.nextLong();
      long b = s.nextLong();
      long c = a * b;
      long d = gcd(a, b);
      c = c/d;
        System.out.println(d + " " + c);
    }
  }
}