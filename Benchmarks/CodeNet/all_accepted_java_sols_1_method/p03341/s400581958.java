import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    int[] a = new int[N + 1];
    int[] b = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      a[i] = a[i - 1];
      if (S[i - 1] == 'W') a[i]++;
    }
    for (int i = N - 1; i >= 0; i--) {
      b[i] = b[i + 1];
      if (S[i] == 'E') b[i]++;
    }
    int min = N;
    for (int i = 1; i <= N; i++) {
      min = Math.min(min, a[i - 1] + b[i]);
    }
    System.out.println(min);
  }
}
