import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int K = scanner.nextInt();
    for (int i = 0; i < K && A + i <= B; i++) System.out.println(A + i);
    for (int i = Math.max(0, A - B + 2 * K - 1); i < K; i++) System.out.println(B - K + i + 1);
  }
}
