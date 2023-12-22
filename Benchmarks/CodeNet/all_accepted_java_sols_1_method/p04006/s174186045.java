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
    long[][] b = new long[n][n];
    for(int i = 0; i < n; i++) {
      b[i][0] = a[i];
      for(int j = 1; j < n; j++) {
        if((i - j) >= 0) {
          b[i][j] = Math.min(b[i][j - 1], a[i - j]);
        } else {
          b[i][j] = Math.min(b[i][j - 1], a[n - (j - i)]);
        }
      }
    }
    long ans = (long)Math.pow(10, 18);
    for(int k = 0; k < n; k++) {
      long t = (x * k);
      for(int i = 0; i < n; i++) {
        t += b[i][k];
      }
      ans = Math.min(ans, t);
    }
    System.out.println(ans);
  }
}