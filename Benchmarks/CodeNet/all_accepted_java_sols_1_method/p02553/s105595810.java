
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    long ans = (a * c);
    ans = Math.max(ans, a * d);
    ans = Math.max(ans, b * c);
    ans = Math.max(ans, b * d);
    System.out.println(ans);
  }
}