import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();

    long count = 0;
    for (int i = 0; i < N - 1; i++) {
      count += A[i] / 2;
      A[i] = A[i] % 2;
      int m = Math.min(A[i], A[i + 1]);
      count += m;
      A[i] -= m;
      A[i + 1] -= m;
    }
    count += A[N - 1] / 2;
    System.out.println(count);
  }
}
