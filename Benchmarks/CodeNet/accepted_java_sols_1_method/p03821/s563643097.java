import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long[] b = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      b[i] = sc.nextLong();
    }
    long ans = 0;
    long p = 0;
    for(int i = n - 1; i >= 0; i--) {
      a[i] += p;
      if((a[i] % b[i]) != 0) {
        long t = b[i] - (a[i] % b[i]);
        ans += t;
        p += t;
      }
    }
    System.out.println(ans);
  }
}