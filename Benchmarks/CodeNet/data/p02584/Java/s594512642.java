import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long k = sc.nextLong();
    long d = sc.nextLong();

    System.out.println(solve(Math.abs(x), k, d));
  }
  static long solve(long x, long k, long d){
    long a = x / d;
    if(a == 0){
      x = x - d;
      k--;
      if(k % 2 == 0){
        return Math.abs(x);
      } else {
        return Math.abs(Math.abs(x) - d);
      }
    } else if(a > k){
      x = x - (k * d);
      return Math.abs(x);
    } else if(a == k){
      return 0;
    } else {
      // (a < k)
      x = x - (a * d);
      k -= a;
      if(k % 2 == 0){
        return Math.abs(x);
      } else {
        return Math.abs(Math.abs(x) - d);
      }
    }
  }
}