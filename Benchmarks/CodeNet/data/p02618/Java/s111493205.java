import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = 26;
    int D = scanner.nextInt();
    int[] c = new int[N];
    int[][] s = new int[D][N];
    for (int i = 0; i < N; i++) c[i] = scanner.nextInt();
    for (int i = 0; i < D; i++) for (int j = 0; j < N; j++) s[i][j] = scanner.nextInt();

    int[] t = new int[D];
    int[] last = new int[N];
    for (int d = 0; d < D; d++) {
      int type = -1;
      int score = -36500 * 26;
      for (int i = 0; i < N; i++) {
        int ss = s[d][i];
        for (int j = 0; j < N; j++) if (j != i) ss -= c[j] * (d + 1 - last[j]);
        if (ss > score) {
          score = ss;
          type = i;
        }
      }
      t[d] = type;
      last[type] = d + 1;
    }

    for (int i = 0; i < D; i++) System.out.println(t[i] + 1);
  }
}
