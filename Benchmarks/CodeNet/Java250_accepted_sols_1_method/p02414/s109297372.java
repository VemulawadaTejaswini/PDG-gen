import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();
    long a[][] = new long[n][m];
    long b[][] = new long[m][l];
    int i, j, k;
    long sum;
    for (i = 0; i < n; i++) {
      for (j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    for (i = 0; i < m; i++) {
      for (j = 0; j < l; j++) {
        b[i][j] = sc.nextInt();
      }
    }
    for (i = 0; i < n; i++) {
      for (j = 0; j < l; j++) {
        sum = 0;
        for (k = 0; k < m; k++) {
          sum += a[i][k] * b[k][j];
        }
        System.out.printf(j == l - 1 ? "%d%n" : "%d ", sum);
      }
    }
  }
}