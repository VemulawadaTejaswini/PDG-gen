import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] a = new int[2][N];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < N; j++) {
        a[i][j] = scanner.nextInt();
      }
    }

    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += a[0][i];
    }
    sum += a[1][N - 1];

    int max = sum;
    for (int i = N - 2; i >= 0; i--) {
      sum += a[1][i] - a[0][i + 1];
      if (sum > max) max = sum;
    }
    System.out.println(max);
  }
}
