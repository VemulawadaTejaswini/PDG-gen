//import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) {// throws IOException {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] s = new int[n];
    for (int ii = 0; ii < n; ii++) {
      s[ii] = scanner.nextInt();
    }
    int q = scanner.nextInt();
    int[] t = new int[q];
    for (int ii = 0; ii < q; ii++) {
      t[ii] = scanner.nextInt();
    }
    int c = 0;
    for (int ii = 0; ii < t.length; ii++) {
      for (int jj = 0; jj < s.length; jj++) {
        if (t[ii] == s[jj]) {
          c++;
          break;
        }
      }
    }
    System.out.println(c);
  }
}