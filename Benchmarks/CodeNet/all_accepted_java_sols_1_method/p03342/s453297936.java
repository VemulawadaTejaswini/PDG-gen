import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[n][20];
    for(int i = 0; i < n; i++) {
      int aa = sc.nextInt();
      for(int j = 0; j < 20; j++) {
        if(aa % 2 == 1) a[i][j] = 1;
        aa /= 2;
      }
    }
    long ans = 0;
    int p = 0;
    int[] b = new int[20];
    for(int i = 0; i < n; i++) {
      ans += (p - i);
      for(int j = p; j < n; j++) {
        int t = 0;
        for(int k = 0; k < 20; k++) {
          b[k] += a[j][k];
          if(b[k] > 1) t++;
        }
        if(t == 0) {
          ans++;
          if(j == (n - 1)) {
            p = n;
            break;
          }
        } else {
          p = j;
          for(int k = 0; k < 20; k++) {
            b[k] -= (a[i][k] + a[j][k]);
          }
          break;
        }
      }
    }
    System.out.println(ans);
  }
}