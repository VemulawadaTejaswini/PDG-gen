import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] gs = new String[6];
    for (int ii = 0; ii < gs.length; ii++) {
      gs[ii] = String.format("%d:", ii + 1);
    }
    for (int ii = 0; ii < n; ii++) {
      double h = scanner.nextDouble();
      if (h < 165) {
        gs[0] += "*";
      } else if (165 <= h && h < 170) {
        gs[1] += "*";
      } else if (170 <= h && h < 175) {
        gs[2] += "*";
      } else if (175 <= h && h < 180) {
        gs[3] += "*";
      } else if (180 <= h && h < 185) {
        gs[4] += "*";
      } else if (185 <= h) {
        gs[5] += "*";
      }
    }
    for (int ii = 0; ii < gs.length; ii++) {
      System.out.println(gs[ii]);
    }
  }
}