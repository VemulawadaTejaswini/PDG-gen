import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    sc.close();

    long ans = 0;
    if (N % 2 == 0) for (long n = N / 2; 0 < n; n /= 5) ans += n / 5;
    System.out.println(ans);
  }
}