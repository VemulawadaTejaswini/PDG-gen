import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] item = {s.substring(0, 1), s.substring(0, 1), s.substring(1)};
    ArrayList<String[]> q = new ArrayList<String[]>();
    q.add(item);
    while (true) {
      String[] t = q.remove(q.size() - 1);
      int sum = Integer.parseInt(t[0]);
      String f = t[1];
      String ss = t[2];
      if (ss.length() > 0) {
        int l = Integer.parseInt(ss.substring(0, 1) + "");
        String[] i = {String.valueOf(sum + l), String.format("%s+%s", f, l), ss.substring(1)};
        String[] ii = {String.valueOf(sum - l), String.format("%s-%s", f, l), ss.substring(1)};
        q.add(i);
        q.add(ii);
      } else {
        if (sum == 7) {
          System.out.println(String.format("%s=7", f));
          break;
        }
      }
    }
  }
}
