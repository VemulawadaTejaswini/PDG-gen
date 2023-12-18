import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    if (K > (N - 1) * (N - 2) / 2) {
      System.out.println(-1);
      return;
    }

    int m = N * (N - 1) / 2;
    int[][] edges = new int[m][2];
    int k = 0;
    for (int i = 1; i <= N; i++) {
      for (int j = i + 1; j <= N; j++) {
        edges[k][0] = i;
        edges[k][1] = j;
        k++;
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append(m - K).append('\n');
    for (int i = 0; i < m - K; i++) {
      sb.append(edges[i][0]).append(' ').append(edges[i][1]).append('\n');
    }
    System.out.print(sb.toString());
  }
}
