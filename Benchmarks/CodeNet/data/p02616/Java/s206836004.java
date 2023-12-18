import java.util.*;

public class Main {

  private static final long MOD = 1_000_000_007;

  public static void main(String[] args) {
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    long[] A = new long[n];
    for (int i = 0; i < n; i++) {
      A[i] = scanner.nextInt();
    }
    List<Long> pos = new ArrayList<>();
    List<Long> neg = new ArrayList<>();
    int zero = 0;
    for (long i : A) {
      if (i > 0) {
        pos.add(i);
      } else if (i < 0) {
        neg.add(i);
      } else {
        zero++;
      }
    }
    if (pos.size() + neg.size() < k || (n == k && zero > 0)) {
      System.out.println(0);
      return;
    }
    if (n == k) {
      long res = 1;
      for (long i : A) {
        res = mul(res, i);
      }
      System.out.println(Math.floorMod(res, MOD));
      return;
    }
    Arrays.sort(A);
    long res = 1;
    int j = A.length - 1;
    int i = 0;
    if (A[j] < 0 || k == 1) {
      for (; k > 0; k--, j--) {
        res = mul(res, A[j]);
      }
      System.out.println(Math.floorMod(res, MOD));
      return;
    }
    if (k % 2 != 0) {
      res = mul(res, A[j]);
      j--;
      k--;
    }
    for (; k > 0; k -= 2) {
      long lft = Math.multiplyExact(A[i], A[i + 1]);
      long rgt = Math.multiplyExact(A[j], A[j - 1]);
      if (lft > rgt) {
        res = mul(res, lft);
        i += 2;
      } else {
        res = mul(res, rgt);
        j -= 2;
      }
    }
    System.out.println(Math.floorMod(res, MOD));
  }

  private static long mul(long a, long b) {
    return (((a + MOD) % MOD) * ((b + MOD) % MOD)) % MOD;
  }

  private static final Scanner scanner = new Scanner(System.in);
}
