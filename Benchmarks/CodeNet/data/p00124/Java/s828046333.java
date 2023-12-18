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
        String wp = "0000" + (w * 3 + d);
        wp = wp.substring(wp.length() - 5, 5);
        ts.add(wp + "," + t);
      }
      Collections.sort(ts);
      Collections.reverse(ts);
      String preWp = "";
      List<String> wk = new ArrayList<String>();
      for (int ii = 0; ii < ts.size(); ii++) {
        String[] works = ts.get(ii).split(",");
//System.out.printf("[%s][%s]\n", preWp, works[0]);
        if (ii != 0 && !preWp.equals(works[0])) {
          Collections.sort(wk);
          //Collections.reverse(wk);
          for (String el : wk) {
            String[] works2 = el.split(",");
            int wp = Integer.parseInt(works2[0]);
            out += works2[1] + "," + wp + "\n";
          }
          wk.clear();
        }
        wk.add(ts.get(ii));
        preWp = works[0];
      }
      if (!wk.isEmpty()) {
        Collections.sort(wk);
        //Collections.reverse(wk);
        for (String el : wk) {
          String[] works = el.split(",");
          int wp = Integer.parseInt(works[0]);
          out += works[1] + "," + wp + "\n";
        }
        wk.clear();
      }
      out += "\n";
    }
    System.out.print(out);
  }
}