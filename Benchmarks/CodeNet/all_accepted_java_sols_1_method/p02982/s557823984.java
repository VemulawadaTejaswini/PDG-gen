import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int d = sc.nextInt();
    int[][] x = new int[n][d];
    int ans = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < d; j++) {
        x[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        double tmp = 0;
        for (int k = 0; k < d; k++) {
          tmp += (x[j][k] - x[i][k]) * (x[j][k] - x[i][k]);
        }
        double sq = Math.sqrt(tmp);
        if ((sq - (int) sq) == 0) {
          ans++;
        }
      }
    }

    System.out.println(ans);

  }
}