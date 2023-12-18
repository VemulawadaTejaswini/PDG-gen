import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int answer = 0;
    int n = sc.nextInt();
    int[][] graph = new int[n + 1][n + 1];
    for (int i = 0; i <= n; i++) {
      Arrays.fill(graph[i], 1);
    }
    for (int i = 1; i <= n - 1; i++) {
      int from = sc.nextInt();
      int to = sc.nextInt();
      int min = Math.min(from, to);
      int max = Math.max(from, to);
      for (int j = 1; j <= min; j++) {
        graph[j][max]--;
      }
    }
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        answer += graph[i][j] * (n + 1 - j);
      }
    }
    out.println(answer);
  }
}