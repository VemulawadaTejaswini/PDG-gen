import java.util.*;

/**
 * C Main
 *
 * @date 2020.09.19
 * @author 焼き鮭 <yaki-shake@up-tri.me>
 */

public class Main {
  Scanner sc;
  long MOD = 1000000007;

  public static void main(String[] args) {
    new Main().execute();
  }

  public void execute() {
    this.sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] ax = new int[n];
    for (int i = 0; i < n; i++) {
      ax[i] = sc.nextInt();
    }

    long prod = 1;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        prod = (prod + (ax[i] % MOD * ax[j] % MOD)) % MOD;
      }
    }

    System.out.println(prod);
  }
}
