import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] c = new int[n - 1];
    int[] s = new int[n - 1];
    int[] f = new int[n - 1];
    for(int i = 0; i < n - 1; i++) {
      c[i] = sc.nextInt();
      s[i] = sc.nextInt();
      f[i] = sc.nextInt();
    }
    int[] ans = new int[n];
    for(int i = n - 2; i >= 0; i--) {
      int t = s[i] + c[i];
      for(int p = i + 1; p < n - 1; p++) {
        for(int j = Math.max(t, s[p]); j < Math.max(t, s[p]) + f[p]; j++) {
          if((j - s[p]) % f[p] == 0) {
            t = j + c[p];
            break;
          }
        }
      }
      ans[i] = t;
    }
    for(int i = 0; i < n; i++) {
      System.out.println(ans[i]);
    }
  }
}