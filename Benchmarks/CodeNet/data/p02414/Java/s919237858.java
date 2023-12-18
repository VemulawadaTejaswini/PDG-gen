import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();
    int[][] A = new int[n][m];
    int[][] B = new int[m][l];
    int[][] ans = new int[n][l];

    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        A[i][j] = sc.nextInt();

    for (int i = 0; i < m; i++)
      for (int j = 0; j < l; j++)
        B[i][j] = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < l; j++) {
        for (int k = 0; k < m; k++) {
          ans[i][j] += A[i][k] * B[k][j];
        }
        System.out.print(ans[i][j]);
        if (j != l - 1)
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}