import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();

    int[][] cost = new int[10][10];
    for (int i = 0; i < 10; i++) for (int j = 0; j < 10; j++) cost[i][j] = scanner.nextInt();

    for (int k = 0; k < 10; k++)
      for (int i = 0; i < 10; i++)
        for (int j = 0; j < 10; j++)
          if (cost[i][k] + cost[k][j] < cost[i][j]) cost[i][j] = cost[i][k] + cost[k][j];

    int mp = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int a = scanner.nextInt();
        if (a >= 0) mp += cost[a][1];
      }
    }
    System.out.println(mp);
  }
}
