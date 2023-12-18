import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N+1];
    long[] sum = new long[N+1];
    for (int i = 1; i <= N; i++) {
      a[i] = sc.nextInt();
      sum[i] = a[i]+sum[i-1];
    }
    List<Long> subSum = new ArrayList<>();
    for (int l = 1; l <= N; l++) {
      for (int r = l; r <= N; r++) {
        subSum.add(sum[r]-sum[l-1]);
      }
    }
    
    long ans = 0;
    boolean[] use = new boolean[subSum.size()];
    Arrays.fill(use, true);
    for (int b = 60; b >= 0; b--) {
      long mask = 1L << b;
      int count = 0;
      for (int i = 0; i < subSum.size(); i++) {
        if (use[i] && ((subSum.get(i)&mask) != 0)) {
         count++;
        }
      }
      
      if (count < K) continue;

      for (int i = 0; i < subSum.size(); i++) {
        if (use[i] && ((subSum.get(i)&mask) == 0)) {
          use[i] = false;
        }
      }
      
      ans += mask;
    }
    
    System.out.println(ans);
  }
}