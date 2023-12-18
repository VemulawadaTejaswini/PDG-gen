import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    ArrayList<ArrayList<String>> ms = new ArrayList<ArrayList<String>>();
    ArrayList<String> rs = new ArrayList<String>();
    int n = scanner.nextInt();
    for (int ii = 0; ii < n; ii++) {
      ms.add(new ArrayList<String>());
    }
    for (;;) {
      String op = scanner.next();
      if (op.equals("quit")) {
        break;
      }
      if (op.equals("push")) {
        int m = scanner.nextInt();
        String b = scanner.next();
        ms.get(m - 1).add(b);
        continue;
      }
      if (op.equals("move")) {
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        ArrayList<String> a = ms.get(f - 1);
        ArrayList<String> b = ms.get(t - 1);
        b.add(a.get(a.size() - 1));
        a.remove(a.size() - 1);
        continue;
      }
      if (op.equals("pop")) {
        int m = scanner.nextInt();
        ArrayList<String> bs = ms.get(m - 1);
        rs.add(bs.get(bs.size() - 1));
        bs.remove(bs.size() - 1);
        continue;
      }
    }
    for (int ii = 0; ii < rs.size(); ii++) {
      System.out.println(rs.get(ii));
    }
  }
}