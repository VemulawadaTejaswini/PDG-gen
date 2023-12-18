import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  String ans;
  ArrayList<String> list;

  void dfs(String str) {
    //check
    String rep = str;
    for (int i = 'b'; i <= 'z'; ++i) {
      rep = rep.replaceFirst((char) i + "", (char) (i - 1) + "");
    }
    if (!rep.equals(ans.substring(0, rep.length()))) {
      return;
    }
    if (str.length() == ans.length()) {
      list.add(str);
    } else {
      char c = ans.charAt(str.length());
      dfs(str + c);
      if (c != 'z') {
        dfs(str + (char) (c + 1));
      }
    }
  }

  void run() {
    for (; ; ) {
      ans = sc.next();
      if (ans.equals("#")) {
        break;
      }
      list = new ArrayList<>();

      dfs("");

//      debug(list);

      int count = list.size();
      System.out.println(count);
      if (count > 10) {
        for (int i = 0; i < 5; ++i) {
          System.out.println(list.get(i));
        }
        for (int i = 0; i < 5; ++i) {
          System.out.println(list.get(list.size() - 5 + i));
        }
      } else {
        for (int i = 0; i < count; ++i) {
          System.out.println(list.get(i));
        }
      }
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}