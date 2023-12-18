import java.util.*;
   
public class Main {
  private static Scanner sc = new Scanner(System.in);
  public static void main(String...args) {
    while(sc.hasNext()) {
      final int n = sc.nextInt();
      if (n == 0)
        break;
      solve(n);
    }
  }
  private static int case_num = 1;
  private static void solve(final int n) {
    final int[] x = new int[n];
    final int[] y = new int[n];
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextInt() - x[0];
      y[i] = sc.nextInt() - y[0];
    }
    int ans = 0;
    for(int i = 2; i < n; i++)
      ans += x[i-1] * y[i] - x[i] * y[i-1];
    System.out.println(case_num++ + " " + (.5 * Math.abs(ans)));
  }
}