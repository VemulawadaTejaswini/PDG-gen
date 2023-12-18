import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int[][] a = new int[H][W];
    for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) a[i][j] = scanner.nextInt();

    final StringBuilder sb = new StringBuilder();
    int size = 0;

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (a[i][j] % 2 == 1) {
          if (j + 1 < W && a[i][j + 1] % 2 == 1) {
            size++;
            sb.append(String.format("%d %d %d %d\n", i + 1, j + 1, i + 1, j + 2));
            a[i][j]--;
            a[i][j + 1]++;
          } else if (i + 1 < H && a[i + 1][j] % 2 == 1) {
            size++;
            sb.append(String.format("%d %d %d %d\n", i + 1, j + 1, i + 2, j + 1));
            a[i][j]--;
            a[i + 1][j]++;
          } else if (j + 1 < W) {
            size++;
            sb.append(String.format("%d %d %d %d\n", i + 1, j + 1, i + 1, j + 2));
            a[i][j]--;
            a[i][j + 1]++;
          } else if (i + 1 < H) {
            size++;
            sb.append(String.format("%d %d %d %d\n", i + 1, j + 1, i + 2, j + 1));
            a[i][j]--;
            a[i + 1][j]++;
          }
        }
      }
    }

    System.out.println(size);
    System.out.print(sb.toString());
  }
}
