import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    long ans = 1;
    for(long i = 1; (i * i) <= m; i++) {
      if((m % i) == 0) {
        long t = m / i;
        if(t >= n) ans = Math.max(ans, i);
        if(i >= n) ans = Math.max(ans, t);
      }
    }
    System.out.println(ans);
  }
}