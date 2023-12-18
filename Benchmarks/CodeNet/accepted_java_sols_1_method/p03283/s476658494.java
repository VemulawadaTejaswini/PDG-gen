import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int Q = scanner.nextInt();
    int[] numEnds = new int[N + 1];
    int[] numStarts = new int[N + 1];
    int[][] rails = new int[M][2];
    for (int i = 0; i < M; i++) {
      rails[i][0] = scanner.nextInt();
      rails[i][1] = scanner.nextInt();
    }
    Arrays.sort(rails, Comparator.comparingInt(o -> o[1]));
    int[][] count = new int[N + 1][N + 1];
    for (int i = 0; i < M; i++) {
      int left = rails[i][0];
      int right = rails[i][1];
      for (int j = right; j <= N; j++) numEnds[j]++;
      for (int j = left + 1; j <= N; j++) numStarts[j]++;
      if (N + 1 >= 0) System.arraycopy(numStarts, 0, count[right], 0, N + 1);
    }
    for (int i = 0; i < Q; i++) {
      int p = scanner.nextInt();
      int q = scanner.nextInt();
      System.out.println(numEnds[q] - count[q][p]);
    }
  }
}
