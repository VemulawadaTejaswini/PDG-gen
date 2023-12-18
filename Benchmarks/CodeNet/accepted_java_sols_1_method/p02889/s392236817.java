import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    long L = scanner.nextLong();

    final long INF = 1_000_000_000_000_000L;
    long[][] dist = new long[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) if (i != j) dist[i][j] = INF;
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      int c = scanner.nextInt();
      dist[a][b] = dist[b][a] = c;
    }

    for (int k = 0; k < N; k++) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
        }
      }
    }

    long[][] dist2 = new long[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) if (i != j) dist2[i][j] = INF;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (i == j) continue;
        dist2[i][j] = dist2[j][i] = dist[i][j] <= L ? 1 : INF;
      }
    }

    for (int k = 0; k < N; k++) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          dist2[i][j] = Math.min(dist2[i][j], dist2[i][k] + dist2[k][j]);
        }
      }
    }

    int Q = scanner.nextInt();
    for (int q = 0; q < Q; q++) {
      int s = scanner.nextInt() - 1;
      int t = scanner.nextInt() - 1;
      if (dist2[s][t] >= INF) System.out.println(-1);
      else System.out.println(dist2[s][t] - 1);
    }
  }
}
