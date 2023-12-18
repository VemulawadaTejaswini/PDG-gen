import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    int D[][] = new int[C][C];
    for (int i = 0; i < C; i++) {
      for (int j = 0; j < C; j++) {
        D[i][j] = Integer.parseInt(sc.next());
      }
    }
    int mod[][] = new int[3][C];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        mod[(i + j) % 3][Integer.parseInt(sc.next()) - 1]++;
      }
    }

    int sum[][] = new int[3][C];
    for (int i = 0; i < 3; i++) {
      for (int color = 0; color < C; color++) {
        for (int j = 0; j < C; j++) {
          sum[i][color] += D[j][color] * mod[i][j];
        }
      }
    }

    int ans = Integer.MAX_VALUE - 12345;
    for (int i = 0; i < C; i++) {
      for (int j = 0; j < C; j++) {
        if (j == i) {
          continue;
        }
        for (int k = 0; k < C; k++) {
          if (k == i || k == j) {
            continue;
          }
          ans = Math.min(ans, sum[0][i] + sum[1][j] + sum[2][k]);
        }
      }
    }
    System.out.println(ans);
  }
}