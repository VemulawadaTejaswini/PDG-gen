import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N + 1];
    int[] b = new int[N];
    for (int i = 0; i < N + 1; i++) a[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) b[i] = scanner.nextInt();

    long count = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 2; j++) {
        int beat = Math.min(a[i + j], b[i]);
        count += beat;
        a[i + j] -= beat;
        b[i] -= beat;
      }
    }
    System.out.println(count);
  }
}
