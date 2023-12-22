import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    Arrays.sort(a);
    int n = a[N - 1];
    int r = -1;
    for (int i = 0; i < N - 1; i++) if (Math.min(a[i], n - a[i]) > Math.min(r, n - r)) r = a[i];
    System.out.printf("%d %d\n", n, r);
  }
}
