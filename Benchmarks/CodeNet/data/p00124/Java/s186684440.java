import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> ts = new ArrayList<String>();
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      for (int ii = 0; ii < n; ii++) {
        String t = scanner.next();
        int w = scanner.nextInt();
        int l = scanner.nextInt();
        int d = scanner.nextInt();
        String wp = "0000" + w * 3 + d;
        wp = wp.substring(wp.length() - 5, 5);
        ts.add(wp + "," + t);
      }
    }
    Collections.sort(ts);
    for (String el : ts) {
      String[] works = el.split(",");
      int wp = Integer.parseInt(works[0]);
      System.out.println(works[1] + "," + wp);
    }
  }
}