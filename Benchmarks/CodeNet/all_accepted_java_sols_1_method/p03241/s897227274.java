import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    long ans = 1;
    for(long i = 1; (i * i) <= m; i++) {
      if((m % i) == 0) {
        if((i * n) <= m) ans = Math.max(ans, i);
        if(((m / i) * n) <= m) ans = Math.max(ans, m / i);
      }
    }
    System.out.println(ans);
  }
}