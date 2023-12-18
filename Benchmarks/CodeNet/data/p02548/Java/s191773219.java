import java.util.*;

/**
 * C Main
 *
 * @date 2020.09.19
 * @author 焼き鮭 <yaki-shake@up-tri.me>
 */

public class Main {
  Scanner sc;
  int[] memo;

  public static void main(String[] args) {
    new Main().execute();
  }

  public void execute() {
    this.sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;
    this.memo = new int[n + 1];
    for (int i = 1; i < n; i++) {
      cnt += countPair(n - i);
    }

    System.out.println(cnt);
  }

  public int countPair(int n) {
    if (this.memo[n] != 0) {
      return this.memo[n];
    }
    int cnt = 0;
    int max = (int) (Math.sqrt(n));
    for (int i = 1; i <= max; i++) {
      if (n % i == 0) {
        cnt += (i == n / i ? 1 : 2);
      }
    }
    this.memo[n] = cnt;
    return cnt;
  }
}
