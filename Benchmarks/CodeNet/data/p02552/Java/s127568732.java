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
    int x = this.sc.nextInt();
    System.out.println(x == 1 ? 0 : 1);
  }
}
