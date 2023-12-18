import java.util.Arrays;
import java.util.Scanner;

// ref https://atcoder.jp/contests/abc143/submissions/8034843
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // num-city
    int M = sc.nextInt(); // num-load
    int L = sc.nextInt(); // litter
    int[] A = new int[M]; // city1
    int[] B = new int[M]; // city2
    int[] C = new int[M]; // distance
    for (int i = 0; i < M; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
      C[i] = sc.nextInt();
    }
    int Q = sc.nextInt();

    long[][] fuel = new long[N + 1][N + 1];
    long[][] dist = new long[N + 1][N + 1];
    long LARGE_VAL_L = Long.MAX_VALUE / 4;
    for (int i = 0; i <= N; i++) {
      Arrays.fill(fuel[i], LARGE_VAL_L);
      Arrays.fill(dist[i], LARGE_VAL_L);
      fuel[i][i] = 0;
      dist[i][i] = 0;
    }
    for (int i = 0; i < M; i++) {
      fuel[A[i]][B[i]] = C[i];
      fuel[B[i]][A[i]] = C[i];
    }
    for (int k = 1; k <= N; k++) {
      for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N; j++) {
          fuel[i][j] = Math.min(fuel[i][j], fuel[i][k] + fuel[k][j]);
        }
      }
    }

    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        if (fuel[i][j] <= L) {
          dist[i][j] = 1;
        }
      }
    }
    for (int k = 1; k <= N; k++) {
      for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N; j++) {
          dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
        }
      }
    }

    while (Q-- > 0) {
      int s = sc.nextInt();
      int t = sc.nextInt();
      if (dist[s][t] == LARGE_VAL_L) {
        System.out.println(-1);
        continue;
      }
      System.out.println(dist[s][t] - 1);
    }
  }
}
