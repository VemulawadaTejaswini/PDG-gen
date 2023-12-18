import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    int n = scanner.nextInt();
    int q = scanner.nextInt();
    int[][] f = new int[q][n];
    for (int ii = 0; ii < q; ii++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      for (int jj = ii; jj < q; jj++) {
        f[jj][a - 1] += b;
      }
    }
for (int ii = 0; ii < q; ii++) {
  int a = 0;
  int v = Integer.MIN_VALUE;
  for (int jj = n - 1; jj >= 0; jj--) {
    if (f[ii][jj] >= v) {
      a = jj + 1;
      v = f[ii][jj];
    }
  }
  System.out.printf("%d %d\n", a, v);
}
  }
}