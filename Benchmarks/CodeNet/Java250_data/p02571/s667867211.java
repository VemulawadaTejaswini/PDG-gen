import java.util.*;

/**
 * B Main
 *
 * @date 2020.09.19
 * @author 焼き鮭 <yaki-shake@up-tri.me>
 */

public class Main {
  Scanner sc;

  public static void main(String[] args) {
    new Main().execute();
  }

  public void execute() {
    this.sc = new Scanner(System.in);
    String[] s = sc.next().split("");
    String[] t = sc.next().split("");

    int min = t.length;
    for (int i = 0; i < s.length; i++) {
      int cnt = 0;
      if (s.length - i >= t.length) {
        for (int j = 0; j < t.length; j++) {
          if (!s[i + j].equals(t[j])) {
            cnt++;
          }
        }
        if (min > cnt) {
          min = cnt;
        }
      }
    }

    System.out.println(min);
  }
}
