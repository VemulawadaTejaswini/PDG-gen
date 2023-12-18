import java.util.*;

/**
 * D Main
 *
 * @date 2020.09.19
 * @author 焼き鮭 <yaki-shake@up-tri.me>
 */

public class Main {
  Scanner sc;
  int MIN = 3;
  int MOD = 1000000007;

  long[] dist = new long[2001];

  public static void main(String[] args) {
    new Main().execute();
  }

  public void execute() {
    this.sc = new Scanner(System.in);
    int s = this.sc.nextInt();
    if (s <= 2) {
      System.out.println(0);
      return;
    }
    System.out.println(distribute(s));
  }

  public long distribute(int a) {
    long sum = 1;
    if (dist[a] != 0) {
      return dist[a];
    }
    for (int c = MIN; c <= (a - MIN); c++) {
      sum = (sum + distribute(c)) % MOD;
    }
    dist[a] = sum;

    return sum;
  }
}
