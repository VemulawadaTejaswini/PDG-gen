import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }

    Arrays.sort(a);
    
    if (N % 2 == 0) {
      long count = 0;
      for (int i = 0; i < N / 2 - 1; i++) {
        count -= 2 * a[i];
      }
      count -= a[N / 2 - 1];
      count += a[N / 2];
      for (int i = N / 2 + 1; i < N; i++) {
        count += 2 * a[i];
      }
      System.out.println(count);
    } else {
      long c1 = 0;
      for (int i = 0; i < N / 2 - 1; i++) {
        c1 -= 2 * a[i];
      }
      c1 -= a[N / 2 - 1];
      c1 -= a[N / 2];
      for (int i = N / 2 + 1; i < N; i++) {
        c1 += 2 * a[i];
      }
      long c2 = 0;
      for (int i = 0; i < N / 2; i++) {
        c2 -= 2 * a[i];
      }
      c2 += a[N / 2];
      c2 += a[N / 2 + 1];
      for (int i = N / 2 + 2; i < N; i++) {
        c2 += 2 * a[i];
      }
      System.out.println(Math.max(c1, c2));
    }
  }
}
