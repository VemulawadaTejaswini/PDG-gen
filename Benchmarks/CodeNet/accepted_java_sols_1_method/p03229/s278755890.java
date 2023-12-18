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

    long sum = 0;
    if (N % 2 == 0) {
      for (int i = 0; i < N; i++) {
        if (i < N / 2 - 1) sum -= 2 * a[i];
        else if (i == N / 2 - 1) sum -= a[i];
        else if (i == N / 2) sum += a[i];
        else sum += 2 * a[i];
      }
    } else {
      for (int i = 0; i < N; i++) {
        if (i < N / 2 - 1) sum -= 2 * a[i];
        else if (i > N / 2 + 1) sum += 2 * a[i];
      }
      long s1 = - 2 * a[N / 2 - 1] + a[N / 2] +     a[N / 2 + 1];
      long s2 = -     a[N / 2 - 1] - a[N / 2] + 2 * a[N / 2 + 1];
      sum += Math.max(s1, s2);
    }
    System.out.println(sum);
  }
}
