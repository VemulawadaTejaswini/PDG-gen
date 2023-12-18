import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      scanner.nextLine();
      int[][] f = new int[n + 1][n + 1];
      int t = 0;
      for (int ii = 0; ii < n; ii++) {
        int rsum = 0;
        for (int jj = 0; jj < n; jj++) {
          f[ii][jj] = scanner.nextInt();
          rsum += f[ii][jj];
          t += f[ii][jj];
        }
        f[ii][n] = rsum;
      }

      for (int ii = 0; ii < n; ii++) {
        int csum = 0;
        for (int jj = 0; jj < n; jj++) {
          csum += f[jj][ii];
        }
        f[n][ii] = csum;
      }

      f[n][n] = t;

      for (int ii = 0; ii <= n; ii++) {
        String out = "";
        for (int jj = 0; jj <= n; jj++) {
          out += String.format("%5d", f[ii][jj]);
        }
        System.out.println(out);
      }
    }
  }
}