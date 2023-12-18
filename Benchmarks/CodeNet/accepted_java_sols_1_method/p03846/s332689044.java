import java.util.Scanner;

public class Main {
  private static final int MOD = (int) Math.pow(10, 9) + 7;

  public static void main(String[] args) {
    Long result = null;

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean isOddN = (N % 2 == 1);
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      int tmpA = sc.nextInt();
      if (tmpA % 2 == 1) {
        if (isOddN) {
          result = Long.valueOf(0);
          break;
        }
        if (a[tmpA - 1] != tmpA) {
          a[tmpA - 1] = tmpA;
        } else if (a[tmpA] != tmpA) {
          a[tmpA] = tmpA;
        } else {
          result = Long.valueOf(0);
          break;
        }
      } else {
        if (!isOddN) {
          result = Long.valueOf(0);
          break;
        }
        if (tmpA == 0) {
          if (a[0] == 1) {
            result = Long.valueOf(0);
            break;
          }
          a[0] = 1;
        } else if (a[tmpA - 1] != tmpA) {
          a[tmpA - 1] = tmpA;
        } else if (a[tmpA] != tmpA) {
          a[tmpA] = tmpA;
        } else {
          result = Long.valueOf(0);
          break;
        }
      }
    }
    sc.close();

    if (result != null) {
      System.out.println(0);
      return;
    }

    int mlt = N / 2;
    result = Long.valueOf(1);
    for (int i = 0; i < mlt; i++) {
      result = (result * 2) % MOD;
    }
    System.out.println((int) result.longValue());
  }
}
