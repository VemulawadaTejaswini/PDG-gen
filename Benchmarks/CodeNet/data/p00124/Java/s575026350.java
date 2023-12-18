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
      List<String> ts = new ArrayList<String>();
      for (int ii = 0; ii < n; ii++) {
        String t = scanner.next();
        int w = scanner.nextInt();
        int l = scanner.nextInt();
        int d = scanner.nextInt();
        String wp = "0000" + w * 3 + d;
        wp = wp.substring(wp.length() - 5, 5);
        String idx = "00" + (n - ii);
        idx = idx.substring(idx.length() - 3, 3);
        ts.add(wp + "," + idx + "," + t);
      }
      Collections.sort(ts);
      Collections.reverse(ts);
      for (String el : ts) {
        String[] works = el.split(",");
        int wp = Integer.parseInt(works[0]);
        out += works[2] + "," + wp + "\n";
      }
      out += "\n";
    }
    System.out.print(out);
  }
}