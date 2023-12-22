import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = Long.parseLong(sc.next());
    long ans = n - 1;
    long a, b;
    for(int i = 1; i <= Math.sqrt(n); i++) {
      if(n % i == 0) {
        a = i;
        b = n / i;
        ans = Math.min(ans, a + b - 2);
      }
    }
    System.out.println(ans);
  }
}
