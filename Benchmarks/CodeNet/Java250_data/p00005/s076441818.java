import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {
      long a = scanner.nextLong();
      long b = scanner.nextLong();

      long gcd = gcd(a, b);
      long lcm = (a * b) / gcd;

      System.out.println(gcd + " " + lcm);
    }
  }

  static long gcd(long n, long m) {
    // 剰余を求めて rに入れる
    long r = n % m;
    // nがmの倍数になっているなら最大公約数は m自身になる．
    if (r == 0) {
      return m;
    }
    // n,mの最大公約数は m,rの最大公約数と等しい
    else {
      return gcd(m, r);
    }
  }
}

