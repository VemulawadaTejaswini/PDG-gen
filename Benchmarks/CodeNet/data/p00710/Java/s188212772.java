import java.util.*;
    
public class Main {
  private static Scanner sc = new Scanner(System.in);
  public static void main(String...args) {
    while(sc.hasNext()) {
      final int n = sc.nextInt();
      final int r = sc.nextInt();
      if (n == 0 && r == 0)
        break;
      solve(n, r);
    }
  }
  private static int case_num = 1;
  private static void solve(final int n, final int r) {
    final int[] p = new int[r];
    final int[] c = new int[r];
    for(int i = 0; i < r; i++) {
      p[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    int ans = 0;
    for(int i = r - 1; i >= 0; i--)
      if(ans < c[i])
        ans += p[i] - 1;
      else if(ans < p[i] - 1 + c[i])
        ans -= c[i];
    System.out.println(n - ans);
  }
}