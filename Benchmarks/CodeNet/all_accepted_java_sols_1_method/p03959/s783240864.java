import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] t = new int[n];
    int[] a = new int[n];
    int[] k1 = new int[n];
    int[] k2 = new int[n];
    for(int i = 0; i < n; i++) {
      t[i] = sc.nextInt();
      if(i == 0) {
        k1[0] = 1;
      } else {
        if(t[i] > t[i - 1]) k1[i] = 1;
      }
    }
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    k2[n - 1] = 1;
    for(int i = n - 1; i >= 1; i--) {
      if(a[i - 1] > a[i]) k2[i - 1] = 1;
    }
    long ans = 1;
    long mod = (long)Math.pow(10, 9) + 7;
    for(int i = 0; i < n; i++) {
      if(k1[i] == 1) {
        if(k2[i] == 1) {
          if(t[i] != a[i]) ans = 0;
        } else {
          if(t[i] > a[i]) ans = 0;
        }
      } else {
        if(k2[i] == 1) {
          if(t[i] < a[i]) ans = 0;
        } else {
          ans = (ans * (long)Math.min(t[i], a[i])) % mod;
        }
      }
    }
    System.out.println(ans);
  }
}