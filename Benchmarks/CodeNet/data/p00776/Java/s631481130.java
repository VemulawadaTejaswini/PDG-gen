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
  int count;

  static String[][] LUT;

  static {
    LUT = new String['z' - 'b' + 1][2];
    for (int i = 'b'; i <= 'z'; ++i) {
      LUT[i - 'b'][0] = (char) i + "";
      LUT[i - 'b'][1] = (char) (i - 1) + "";
    }
  }


  void dfs(String str) {
    //check
    String rep = str;
    for (int i = 'b'; i <= 'z'; ++i) {
      rep = rep.replaceFirst(LUT[i - 'b'][0], LUT[i - 'b'][1]);
    }
    if (!rep.equals(ans.substring(0, rep.length()))) {
      return;
    }
    if (str.length() == ans.length()) {
      if (list.size() < 10) {
        list.add(str);
      } else {
        list.remove(5);
        list.add(str);
      }
      ++count;
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
      count = 0;

      dfs("");

//      debug(list);

      System.out.println(count);
      for (int i = 0; i < Math.min(count, 10); ++i) {
        System.out.println(list.get(i));
      }
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}