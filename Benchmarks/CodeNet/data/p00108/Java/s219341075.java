import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      Map<Integer, Integer> m = new HashMap<Integer, Integer>();
      int[] a = new int[n];
      int[] b = new int[n];
      for (int ii = 0; ii < n; ii++) {
        a[ii] = scanner.nextInt();
      }
      for (int cnt = 0; ; cnt++) {
        for (int ii = 0; ii < n; ii++) {
          if (m.containsKey(a[ii])) {
            m.put(a[ii], m.get(a[ii]) + 1);
          } else {
            m.put(a[ii], 1);
          }
        }
        for (int ii = 0; ii < n; ii++) {
          b[ii] = m.get(a[ii]);
        }
        if (!chk(a, b)) {
          for (int ii = 0; ii < n; ii++) {
            a[ii] = b[ii];
            m.clear();
          }
        } else {
          out += cnt + "\n";
          for (int ii = 0; ii < n; ii++) {
            out += b[ii];
            out += ii != n - 1 ? " " : "\n";
          }
          break;
        }
      }
    }
    System.out.println(out);
  }

  private static boolean chk (int[] a, int[] b) {
    for (int ii = 0; ii < a.length; ii++) {
      if (a[ii] != b[ii]) {
        return false;
      }
    }
    return true;
  }

}