import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    int n = -1;
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      if (line.equals("0")) {
        break;
      }
      if (Character.isDigit(line.charAt(0))) {
        n = Integer.parseInt(line);
        continue;
      }
      if (n == 1) {
        out += line.equals("*") ? "0" : "1";
        continue;
      }
      String[][] f = new String[n * 2 + 1][n * 2 + 1];
      for (int ii = 0; ii < n; ii++) {
        if (ii != 0) {
          line = scanner.nextLine();
        }
        for (int jj = 0; jj < n; jj++) {
          f[ii][jj] = line.substring(jj, jj + 1);
        }
      }

int a = 0;
for (int nn = 1; nn <= n; nn++) {
  for (int ii = 0; ii < n; ii++) {
    for (int jj = 0; jj < n; jj++) {
      boolean flag = true;
      for (int row = 0; row < nn; row++) {
        for (int col = 0; col < nn; col++) {
          if (f[ii + row][jj + col] == null || !f[ii + row][jj + col].equals(".")) {
            flag = false;
          }
        }
      }
      if (flag && a < nn) {
        a = nn;
      }
    }
  }
}
out += a + "\n";
    }
    System.out.print(out);
  }
}