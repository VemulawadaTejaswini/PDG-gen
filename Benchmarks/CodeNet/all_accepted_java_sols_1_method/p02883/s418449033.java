import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long K = scanner.nextLong();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    int[] f = new int[N];
    for (int i = 0; i < N; i++) f[i] = scanner.nextInt();

    Arrays.sort(a);
    Arrays.sort(f);

    long[] af = new long[N];
    long right = -1;
    for (int i = 0; i < N; i++) {
      af[i] = (long) f[i] * a[N - i - 1];
      right = Math.max(right, af[i]);
    }

    long left = -1;
    while (right - left > 1) {
      long mid = (left + right) / 2;
      long k = 0;
      for (int i = 0; i < N; i++) {
        if (af[i] > mid) k += (af[i] - mid - 1) / f[i] + 1;
      }
      if (k <= K) {
        right = mid;
      } else {
        left = mid;
      }
    }
    System.out.println(right);
  }
}
