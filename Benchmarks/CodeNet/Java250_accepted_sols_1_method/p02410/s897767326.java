import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int[][] mat = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        mat[i][j] = s.nextInt();
      }
    }
    int[] vec = new int[m];
    for (int i = 0; i < m; i++) {
      vec[i] = s.nextInt();
    }
    s.close();
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j < m; j++) {
        sum += mat[i][j] * vec[j];
      }
      System.out.println(sum);
    }
  }
}

