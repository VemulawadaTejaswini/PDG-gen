import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] a = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    int[][] ans = new int[n][m];

    for (int i = 0; i < m; i++) {      
      int b = sc.nextInt();
      for (int j = 0; j < n; j++) {
        ans[j][i] = a[j][i] * b;
      }
    }

    for (int[] x : ans) {
      pw.println(Arrays.stream(x).sum());
    }

    pw.flush();
    sc.close();
  }
}
