import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int Q = scanner.nextInt();
    int[][] cum = new int[N + 1][N + 1];
    for (int i = 0; i < M; i++) {
      int left = scanner.nextInt();
      int right = scanner.nextInt();
      cum[left][right] += 1;
    }
    for (int i = 1; i <= N; i++) {
      int sum = 0;
      for (int j = 1; j <= N; j++) {
        sum += cum[i][j];
        cum[i][j] = sum + cum[i - 1][j];
      }
    }
    for (int i = 0; i < Q; i++) {
      int p = scanner.nextInt();
      int q = scanner.nextInt();
      System.out.println(cum[q][q] - cum[p - 1][q] - cum[q][p - 1] + cum[p - 1][p - 1]);
    }
  }
}
