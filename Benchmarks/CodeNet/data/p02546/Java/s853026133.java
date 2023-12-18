import java.util.*;

/**
 * A Main
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
    String _s = sc.next();
    String[] s = _s.split("");
    System.out.println(_s + (s[s.length - 1].equals("s") ? "es" : "s"));
  }
}
