import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    StringBuilder sb = new StringBuilder();
    int[] r = new int[N];
    for (int i = 0; i < N; i++) {
      r[0] += (i % 2 == 0 ? 1 : -1) * a[i];
    }
    sb.append(r[0]).append(' ');
    for (int i = 1; i < N; i++) {
      r[i] = 2 * a[i - 1] - r[i - 1];
      sb.append(r[i]).append(' ');
    }
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }
}
