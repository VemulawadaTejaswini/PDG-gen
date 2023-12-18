
import java.io.*;
import java.util.*;

public class Main {
  // constant

  static final int MAX_P = 1000000;

  // subroutines

  static boolean[] gen_primes(int max_p) {
    boolean[] primes = new boolean[max_p + 1];
    Arrays.fill(primes, true);
    primes[0] = primes[1] = false;

    int s_max_p = (int)Math.sqrt((double)max_p + 0.5);

    for (int p = 2; p <= s_max_p; p++)
      if (primes[p])
        for (int q = p * p; q <= max_p; q += p)
          primes[q] = false;

    return primes;
  }

  // main
  public static final void main(String[] args) throws Exception {
    boolean[] primes = gen_primes(MAX_P);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String[] nums = br.readLine().trim().split(" ");
      int n = Integer.parseInt(nums[0]);
      int x = Integer.parseInt(nums[1]);

      if (n == 0 && x == 0) break;

      int[] menu = new int[n];
      boolean[] sums = new boolean[x + 1];
      Arrays.fill(sums, false);

      for (int i = 0; i < n; i++) {
        menu[i] = Integer.parseInt(br.readLine().trim());
        sums[menu[i]] = true;
      }

      for (int i = 0; i < n; i++) {
        int pr = menu[i];
        int max_j = x - pr;
        for (int j = 0; j <= max_j; j++)
          if (sums[j])
            sums[j + pr] = true;
      }

      int max_sum = 0;
      for (int j = x; j >= 0; j--)
        if (sums[j] & primes[j]) {
          max_sum = j;
          break;
        }

      System.out.println(max_sum > 0 ? max_sum : "NA");
    }
  }
}