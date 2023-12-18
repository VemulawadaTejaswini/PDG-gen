import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      final int n = sc.nextInt();

      if(n == 0) break;

      int[][] table = new int[n + 1][n + 1];

      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          table[i][j] = sc.nextInt();
        }
      }

      for(int i = 0; i < n; i++) {
        table[i][n] = 0;
        for(int j = 0; j < n; j++) {
          table[i][n] += table[i][j];
        }
      }

      for(int i = 0; i <= n; i++) {
        table[n][i] = 0;
        for(int j = 0; j < n; j++) {
          table[n][i] += table[j][i];
        }
      }

      for(int i = 0; i <= n; i++) {
        for(int j = 0; j <= n; j++) {
          System.out.printf("%5d", table[i][j]);
        }
        System.out.println();
      }
    }
  }

  private final Scanner sc = new Scanner(System.in);
}