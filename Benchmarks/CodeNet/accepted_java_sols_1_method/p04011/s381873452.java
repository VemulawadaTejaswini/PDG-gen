import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long x = sc.nextLong();
    long y = sc.nextLong();
    long ans = 0;
    if(n <= k) {
      ans = (x * n);
    } else {
      ans = (x * k) + (y * (n - k));
    }
    System.out.println(ans);
  }
}