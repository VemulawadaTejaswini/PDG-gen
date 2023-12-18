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
    long a = this.sc.nextInt();
    long b = this.sc.nextInt();
    long c = this.sc.nextInt();
    long d = this.sc.nextInt();

    long[] p = new long[4];
    p[0] = a * c;
    p[1] = b * c;
    p[2] = a * d;
    p[3] = b * d;

    Arrays.sort(p);
    System.out.println(p[3]);
  }
}
