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
    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();

    System.out.println(d * 1.0 / s <= t ? "Yes" : "No");
  }
}
