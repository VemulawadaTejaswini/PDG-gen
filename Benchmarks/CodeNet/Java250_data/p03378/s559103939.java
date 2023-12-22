import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int X = scanner.nextInt();

    int A[] = new int[N + 1];

    for (int i = 1; i <= M; i++) {
      A[scanner.nextInt()] = 1;
    }

    int to0 = 0;
    for (int i = 0; i < X; i++) {
      to0 += A[i];
    }
    int toN = 0;
    for (int i = X; i < N; i++) {
      toN += A[i];
    }
    if (to0 > toN) {
      System.out.println(toN);
    } else {
      System.out.println(to0);
    }

  }

}
