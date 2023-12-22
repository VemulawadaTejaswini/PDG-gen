import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int H = scanner.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      b[i] = scanner.nextInt();
    }

    Arrays.sort(a);
    Arrays.sort(b);

    int amax = a[N - 1];

    int count = 0;
    for (int i = N - 1; i >= 0; i--) {
      if (b[i] > amax && H > 0) {
        count++;
        H -= b[i];
      }
    }
    if (H > 0) {
      count += (H - 1) / amax + 1;
    }
    System.out.println(count);
  }
}
