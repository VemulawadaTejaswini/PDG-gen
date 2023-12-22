import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A[] = new int[N];
    int B[] = new int[N - 1];
    int sumA = 0;

    for (int i = 0; i < N - 1; i++) {
      B[i] = sc.nextInt();
    }

    for (int i = N - 1; i >= 0; i--) {

      if (i == 0) {
        A[i] = B[i];
        continue;
      }

      if (i == N - 1) {
        A[i] = B[i - 1];
        continue;
      }

      if (B[i] >= B[i - 1]) {
        A[i] = B[i - 1];

      } else {
        A[i] = B[i];

      }
    }

    for (int i = 0; i < N; i++) {
      sumA += A[i];
    }

    System.out.println(sumA);
    sc.close();
  }
}
