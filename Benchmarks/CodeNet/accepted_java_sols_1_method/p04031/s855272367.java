import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int ans = Integer.MAX_VALUE;
    for(int t = -100; t <= 100; t++) {
      int m = 0;
      for(int i = 0; i < n; i++) {
        m += ((a[i] - t) * (a[i] - t));
      }
      ans = Math.min(ans, m);
    }
    System.out.println(ans);
  }
}