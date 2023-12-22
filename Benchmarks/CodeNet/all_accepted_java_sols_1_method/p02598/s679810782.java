import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    long[] a = new long[n];
    long ans = 0;
    long m = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      m = Math.max(m, a[i]);
    }
    ans = m;
    long left = 1;
    long right = m;
    while(left < right) {
      long med = (left + right) / (long)2;
      long t = 0;
      for(int i = 0; i < n; i++) {
        t += (((a[i] + med - 1) / med) - 1);
      }
      if(t <= k) {
        ans = med;
        right = med;
      } else {
        left = med + 1;
      }
    }
    System.out.println(ans);
  }
}