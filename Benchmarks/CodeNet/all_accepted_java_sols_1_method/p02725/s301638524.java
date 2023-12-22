import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    long ans = k;
    for(int i = 0; i < n; i++) {
      long t = 0;
      if(i == (n - 1)) {
        t = (k - a[n - 1]) + a[0];
      } else {
        t = a[i + 1] - a[i];
      }
      ans = Math.min(ans, k - t);
    }
    System.out.println(ans);
  }
}