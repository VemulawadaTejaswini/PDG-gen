import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    String[] keitai = {
        "",
        ".,!? ",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    String reg = "\\d*?0";
    Pattern pt = Pattern.compile(reg);

    int n = ni();

    for (int i = 0; i < n; ++i) {
      Matcher mc = pt.matcher(sc.next());
      while (mc.find()) {
        int l = mc.group().length() - 1;
        char c = mc.group().charAt(0);
        if (l > 0) {
          int idx = c - '0';
          System.out.print(keitai[idx].charAt((l - 1) % keitai[idx].length()));
        }
      }
      System.out.println();
    }
  }

  int ni() {
    return sc.nextInt();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}