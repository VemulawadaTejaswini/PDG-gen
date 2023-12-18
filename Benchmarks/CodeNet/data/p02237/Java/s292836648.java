import java.util.*;

public class Main {
  private final Scanner sc = new Scanner(System.in);

  public void run() {
    int n = sc.nextInt();

    int[][] mat = new int[n][n];

    for (int i = 0; i < n; i++) {
      int u = sc.nextInt() - 1;
      int k = sc.nextInt();

      for (int j = 0; j < n; j++) {
        mat[u][j] = 0;
      }

      for (int j = 0; j < k; j++) {
        mat[u][sc.nextInt() - 1] = 1;
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println(mat[i][n - 1]);
    }
  }

  public static void main(String[] args) {
    new Main().run();
  }
}