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
      int[] pow1 = new int[N];
      int[] pow0 = new int[N];
      pow1[0] = 1;
      pow0[0] = 1;
      for (int i = 1; i < N; i++) {
        pow1[i] = (pow1[i - 1] * 2) % (bitCnt + 1);
        if (bitCnt != 1) {
          pow0[i] = (pow0[i - 1] * 2) % (bitCnt - 1);
        }
      }
      int sum1 = 0;
      int sum0 = 0;
      for (int i = 0; i < N; i++) {
        if (A[i] == '1') {
          sum1 += pow1[N - 1 - i] % (bitCnt + 1);
          if (bitCnt != 1) {
            sum0 -= pow0[N - 1 - i] % (bitCnt - 1);
          }
        }
      }
      for (int i = 0; i < N; i++) {
        if (A[i] == '1') {
          if (bitCnt == 1) {
            System.out.println(0); // val % 1 = 0
            continue;
          }
          int val = (sum0 - pow0[N - 1 - i]) % (bitCnt - 1);
          System.out.println(getStepsCnt(val));
        } else {
          int val = (sum1 + pow1[N - 1 - i]) % (bitCnt + 1);
          System.out.println(getStepsCnt(val));
        }
      }
    }
  }

  private static int getStepsCnt(int val) {
    int cnt = 1;
    while (val > 0) {
      val = val % Integer.bitCount(val);
      cnt++;
    }
    return cnt;
  }

  public static void main(String[] args) {
    int N = scanner.nextInt();
    String X = scanner.next();
    solve(X, N);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
