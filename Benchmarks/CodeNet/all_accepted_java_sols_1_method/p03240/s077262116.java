import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] x = new long[n];
    long[] y = new long[n];
    long[] h = new long[n];
    long X = 0;
    long Y = 0;
    long H = 0;
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextLong();
      y[i] = sc.nextLong();
      h[i] = sc.nextLong();
      if(h[i] > 0) {
        X = x[i];
        Y = y[i];
        H = h[i];
      }
    }
    long ansx = 0;
    long ansy = 0;
    long ansh = 0;
    for(long cx = 0; cx <= 100; cx++) {
      for(long cy = 0; cy <= 100; cy++) {
        long th = H + Math.abs(X - cx) + Math.abs(Y - cy);
        int p = 0;
        for(int i = 0; i < n; i++) {
          long t = Math.max(th - Math.abs(x[i] - cx) - Math.abs(y[i] - cy), 0);
          if(t != h[i]) p++;
        }
        if(p == 0) {
          ansx = cx;
          ansy = cy;
          ansh = th;
        }
      }
    }
    System.out.println(ansx + " " + ansy + " " + ansh);
  }
}
