import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    long ans = 0;
    long count = Math.min(N, M / 2);
    ans += count;
    M -= 2 * count;
    ans += M / 4;
    System.out.println(ans);
  }
}