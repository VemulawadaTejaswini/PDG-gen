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

    for (int i = 0; i < H * W - 1; i++) {
      int y = i / W;
      int x = y % 2 == 0 ? i - y * W : (y + 1) * W - i - 1;
      if (a[y][x] % 2 == 1) {
        int ny = (i + 1) / W;
        int nx = ny % 2 == 0 ? (i + 1) - ny * W : (ny + 1) * W - i - 2;
        a[ny][nx]++;
        size++;
        sb.append(String.format("%d %d %d %d\n", y + 1, x + 1, ny + 1, nx + 1));
      }
    }

    System.out.println(size);
    System.out.print(sb.toString());
  }
}
