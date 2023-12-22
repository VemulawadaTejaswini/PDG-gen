import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] s = new String[1];
    s[0] = sc.next();
    s[0] = "1" + s[0];

    String[] a = {"dream", "dreamer", "erase", "eraser"};

    s[0] = rep(s, a[3]);
    s[0] = rep(s, a[2]);
    s[0] = rep(s, a[1]);
    s[0] = rep(s, a[0]);

    System.out.println(s[0].equals("1") ? "YES" : "NO");

  }

  public static String rep (String[] s, String a) {
    boolean ok = true;
    while (ok) {
      int n = s[0].indexOf(a);
      if (n == -1) {
        ok = false;
      } else {
        s[0] = s[0].replaceAll(a, "");
      }
    }
    return s[0];
  }
  
}