import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long[][] cake = new long[n][3];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < 3; j++) {
        cake[i][j] = sc.nextLong();
      }
    }
    long ans = 0;
    for(int k = 0; k < 8; k++) {
      long[] sum = new long[n];
      for(int i = 0; i < n; i++) {
        long s = 0;
        for(int j = 0; j < 3; j++) {
          if((k & (1 << j)) == 0) {
            s += cake[i][j];
          } else {
            s += (-1) * cake[i][j];
          }
        }
        sum[i] = s;
      }
      Arrays.sort(sum);
      long t = 0;
      for(int l = n - 1; l >= n - m; l--) {
        t += sum[l];
      }
      ans = Math.max(ans, t);
    }
    System.out.println(ans);
  }
}