import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int L = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    int l = -1;
    for (int i = 0; i < N - 1; i++) {
      if (a[i] + a[i + 1] >= L) {
        l = i;
        break;
      }
    }
    if (l < 0) {
      System.out.println("Impossible");
      return;
    }
    System.out.println("Possible");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < l; i++) sb.append(i + 1).append('\n');
    for (int i = N - 2; i > l; i--) sb.append(i + 1).append('\n');
    sb.append(l + 1);
    System.out.println(sb.toString());
  }
}
