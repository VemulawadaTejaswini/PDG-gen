import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    int[] dp = new int[h + 1];
    Arrays.fill(dp, 2000000000);
    dp[h] = 0;
    for (int hitpoint = h; hitpoint >= 0; hitpoint--) {
      for (int i = 0; i < n; i++) {
        int damage = a[i];
        int magicPoint = b[i];
        int index = Math.max(hitpoint - damage, 0);
        dp[index] = Math.min(dp[index], dp[hitpoint] + magicPoint);
      }
    }
    System.out.println(dp[0]);
  }
}
