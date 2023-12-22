import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N + 1];
    int[] B = new int[N];
    for (int i = 0; i < N + 1; i++) A[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) B[i] = scanner.nextInt();

    long res = 0;
    for (int i = 0; i < N; i++) {
      int c = Math.min(A[i], B[i]);
      res += c;
      B[i] -= c;
      c = Math.min(A[i + 1], B[i]);
      res += c;
      A[i + 1] -= c;
    }
    System.out.println(res);
  }
}
