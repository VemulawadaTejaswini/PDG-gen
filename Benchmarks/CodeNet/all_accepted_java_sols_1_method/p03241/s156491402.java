import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    long ans = 0;
    for(long x = 1; x * x <= m; x++) {
      if((m % x) == 0) {
        if((m / x) >= n) {
          ans = Math.max(ans, x);
        }
        if(x >= n) {
          ans = Math.max(ans, m / x);
        }
      }
    }
    System.out.println(ans);
  }
}