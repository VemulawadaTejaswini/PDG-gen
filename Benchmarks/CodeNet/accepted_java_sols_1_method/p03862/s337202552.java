import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long x = sc.nextLong();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    long ans = 0;
    for(int i = 0; i < n - 1; i++) {
      if(a[i] >= x) {
        ans += (a[i] + a[i + 1] - x);
        a[i + 1] = 0;
        a[i] = x;
      } else {
        ans += Math.max(0, (a[i] + a[i + 1] - x));
        a[i + 1] -= Math.max(0, (a[i] + a[i + 1] - x));
      }
    }
    System.out.println(ans);
  }
}
