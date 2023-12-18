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
    for (int i = 0; i < D; i++) t[i] = scanner.nextInt() - 1;

    int v = 0;
    int[] last = new int[N];
    for (int d = 0; d < D; d++) {
      int type = t[d];
      v += s[d][type];
      last[type] = d + 1;
      for (int i = 0; i < N; i++) v -= c[i] * (d + 1 - last[i]);
      System.out.println(v);
    }
  }
}
