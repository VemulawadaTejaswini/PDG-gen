import java.util.Scanner;
public class Main {
  public static void display(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        System.out.print(m[i][j]);
        if (j < m.length - 1)
          System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[][] m = new int[n][n];
    for (int i = 0; i < n; i++) {
      int u = s.nextInt();
      int k = s.nextInt();
      for (int j = 0; j < k; j++) {
        int neighbor = s.nextInt();
        m[u-1][neighbor-1] = 1;
      }
    }
    s.close();
    display(m);
  }
}

