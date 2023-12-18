import java.util.*;
import java.math.*;

public class Main {

  // int n = sc.nextInt();
  // long m = sc.nextLong();
  // String s = sc.next();

  // // 最大公約数
  // public static long gcd (long m,long n) {
  //   if (m < n) return gcd(n,m);
  //   if (n == 0) return m;
  //   return gcd(n,m%n);
  // }
  //
  // // 最小公倍数
  // public static long lcm (long m,long n) {
  //   return m*n/gcd(m,n);
  // }
  //
  // // 素数判定
  // public static boolean isPrime (long n) {
  //   if (n == 2) return true;
  //   if (n < 2 || n%2 == 0) return false;
  //   double d = Math.sqrt(n);
  //   for (int i = 3; i <= d; i+=2) {
  //     if (n%i == 0) {
  //       return false;
  //     }
  //   }
  //   return true;
  // }
  //
  // public static final long gcd3(long[] param) {
  //   int len = param.length;
  //   long g = gcd(param[0], param[1]);    //gcd(a, b) は以前作ったもの
  //   for (int i = 1; i < len - 1; i++) {
  //       g = gcd(g, param[i + 1]);       //gcd(a, b) は以前作ったもの
  //   }
  //   return g;
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();

    System.out.println(2*r*3.14);

  }

}
