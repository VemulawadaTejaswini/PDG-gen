import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();

    int[][] a = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    int[][] b = new int[m][l];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < l; j++) {
        b[i][j] = sc.nextInt();
      }
    }

    long[][] ans = new long[n][l];
    for (int i = 0; i < n; i++) {      
      for (int j = 0; j < l; j++) {
        for (int k = 0; k < m; k++) {
          ans[i][j] += a[i][k] * b[k][j];
        }
      }
    }

    for (int i = 0; i < n; i++) { 
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < l; j++) {
        sb.append(ans[i][j] + " ");
      }
      pw.println(sb.toString().trim());
    }

    pw.flush();
    sc.close();
  }
}
