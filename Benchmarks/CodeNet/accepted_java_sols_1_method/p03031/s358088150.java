import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    boolean[][] s = new boolean[m][n];
    int[] p = new int[m];
    int[] cnt = new int[m];
    int res = 0;
    boolean acc;

    for (int i = 0; i < m; i++) {
      int k = sc.nextInt();
      for (int j = 0; j < k; j++) {
        s[i][sc.nextInt() - 1] = true;
      }
    }

    for (int i = 0; i < m; i++) {
      p[i] = sc.nextInt();
    }

    for (int bit = 0; bit < Math.pow(2, n); bit++) {
      Arrays.fill(cnt, 0);
      acc = true;
      for (int i = 0; i < n; i++) {
        if ((1 & (bit >> i)) == 1) { // i が bit に入るかどうか
          for (int j = 0; j < m; j++) {
            if (s[j][i]) {
              cnt[j]++;
            }
          }
        }
      }

      for (int i = 0; i < m; i++) {
        if (cnt[i] % 2 != p[i]) {
          acc = false;
          break;
        }
      }

      if (acc) {
        res++;
      }
    }

    System.out.println(res);

  }

}