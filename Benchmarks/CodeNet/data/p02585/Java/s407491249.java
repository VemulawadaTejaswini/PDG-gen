import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] p = new int[n];
    long[] c = new long[n];
    for(int i = 0; i < n; i++) {
      p[i] = sc.nextInt() - 1;
    }
    for(int i = 0; i < n; i++) {
      c[i] = sc.nextLong();
    }
    long ans = (-1) * (long)Math.pow(10, 18);
    for(int i = 0; i < n; i++) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(i);
      int q = i;
      long[] d = new long[n];
      long[] d2 = new long[n];
      for(int j = 0; j <= n; j++) {
        q = p[q];
        if(j == 0) {
          d[j] = c[q];
        } else {
          d[j] = d[j - 1] + c[q];
        }
        if(j == 0) {
          d2[j] = d[j];
        } else {
          d2[j] = Math.max(d2[j - 1], d[j]);
        }
        if(q == i) {
          break;
        } else {
          list.add(q);
        } 
      }
      int t = list.size();
      if(k <= t) {
        ans = Math.max(ans, d2[k - 1]);
      } else {
        if(d[t - 1] <= 0) {
          ans = Math.max(ans, d2[t - 1]);
        } else {
          for(int j = 0; j < t; j++) {
            int m = (k - j - 1) / t;
            ans = Math.max(ans, ((long)m * d[t - 1]) + d[j]);
          }
        }
      }
    }
    System.out.println(ans);
  }
}