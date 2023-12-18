import java.util.*;

public class Main {

  private static void solve(String X, int N) {
    char[] A = X.toCharArray();
    int bitCnt = 0;
    for (char c : A) {
      if (c == '1') {
        bitCnt++;
      }
    }
    if (bitCnt == 0) {
      for (int i = 0; i < N; i++) {
        System.out.println(1);
      }
    } else {
      int sum1 = 0;
      int sum0 = 0;
      for (int i = 0; i < N; i++) {
        if (A[i] == '1') {
          sum1 = add(sum1, pow(2, N - 1 - i, bitCnt + 1), bitCnt + 1);
          if (bitCnt > 0) {
            sum0 = add(sum0, pow(2, N - 1 - i, bitCnt - 1), bitCnt - 1);
          }
        }
      }
      for (int i = 0; i < N; i++) {
        if (A[i] == '1') {
          if (bitCnt == 1) {
            System.out.println(0); // val % 1 = 0
            continue;
          }
          int val = add(sum0, -pow(2, N - 1 - i, bitCnt - 1), bitCnt - 1);
          int res = 1;
          while (val > 0) {
            val = val % Integer.bitCount(val);
            res++;
          }
          System.out.println(res);
        } else {
          int val = add(sum1, +pow(2, N - 1 - i, bitCnt + 1), bitCnt + 1);
          int res = 1;
          while (val > 0) {
            val = val % Integer.bitCount(val);
            res++;
          }
          System.out.println(res);
        }
      }
    }
  }

  private static int mul(int a, int b, int mod) {
    return Math.multiplyExact(a, b) % mod;
  }

  private static int add(int a, int b, int mod) {
    return Math.addExact(a, b) % mod;
  }

  private static int pow(int x, int p, int mod) {
    int res = 1;
    while (p != 0) {
      if ((p & 1) != 0) {
        res = mul(res, x, mod);
      }
      x = mul(x, x, mod);
      p >>= 1;
    }
    return res;
  }

  public static void main(String[] args) {
    int N = scanner.nextInt();
    String X = scanner.next();
    solve(X, N);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
