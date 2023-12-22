import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int vNum = scanner.nextInt();
    int hNum = scanner.nextInt();

    int[] v = new int[vNum];
    for (int ii = 0; ii < v.length; ii++) {
      v[ii] = ii + 1;
    }

    String[] h = new String[hNum];
    for (int ii = 0; ii < h.length; ii++) {
      h[ii] = scanner.next();
    }

    for (int ii = 0; ii < h.length; ii++) {
      String[] hs = h[ii].split(",");
      int[] hwork = new int[2];
      hwork[0] = Integer.parseInt(hs[0]) - 1;
      hwork[1] = Integer.parseInt(hs[1]) - 1;
      v[hwork[0]] = v[hwork[0]] + v[hwork[1]];
      v[hwork[1]] = v[hwork[0]] - v[hwork[1]];
      v[hwork[0]] = v[hwork[0]] - v[hwork[1]];
    }

    for (int ii = 0; ii < v.length; ii++) {
      System.out.println(v[ii]);
    }
  }
}