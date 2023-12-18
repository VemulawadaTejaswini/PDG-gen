import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();
    int[][] a = new int[n][m];
    int[][] b = new int[m][l];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; i++) {
        a[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < l; i++) {
        b[i][j] = sc.nextInt();
      }
    }
    long[][] c = new long[n][l];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < l; j++) {
        for (int k = 0; k < m; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < l - 1; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println(c[i][l - 1]);
    }
  }
}

