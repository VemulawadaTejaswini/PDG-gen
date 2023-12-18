import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int[] ma = new int[n];
    ma[n - 1] = a[n - 1];
    for(int i = n - 2; i >= 0; i--) {
      ma[i] = Math.max(ma[i + 1], a[i]);
    }
    int M = 0;
    for(int i = 0; i < n; i++) {
      M = Math.max(M, ma[i] - a[i]);
    }
    int ans = 0;
    for(int i = 0; i < n; i++) {
      if(M == (ma[i] - a[i])) ans++;
    }
    System.out.println(ans);
  }
}