import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long st = in.nextLong();
    long en = in.nextLong();
    long mod1 = in.nextLong();
    long mod2 = in.nextLong();
    in.close();
    long mod1and2 = lcmul(mod1, mod2);
    long countand = en / mod1and2;
    countand -= (st - 1) / mod1and2;
        long countor = en / mod1 - (st - 1) / mod1 + en / mod2 - (st - 1) / mod2;
    long ans = en - st - countor + countand  + 1;
    System.out.println(ans);
  }
  public static long gcdiv(long a, long b) {
    while (a != b) {
      if (a > b) {
        a -= b;// * (a / b);
      } else if (b > a) {
        b -= a;// * (b / a);
      }
    }
    return a;
  }
  public static long lcmul(long a, long b) {
    long gcdiv = gcdiv(a, b);
    a /= gcdiv;
    b /= gcdiv;
    return a * b * gcdiv;
  }
  public static long lcmul(long a, long b, long gcdiv) {
    a /= gcdiv;
    b /= gcdiv;
    return a * b * gcdiv;
  }
}