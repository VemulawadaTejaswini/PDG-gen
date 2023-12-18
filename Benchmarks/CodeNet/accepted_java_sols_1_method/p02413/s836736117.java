import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int r = stdin.nextInt();
    int c = stdin.nextInt();
    int[][] sheet = new int[r + 1][c + 1];

    int sum = 0;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        int n = stdin.nextInt();
        sheet[i][j] = n;
        sheet[r][j] += n;
        sheet[i][c] += n;
        sum += n;
      }
    }

    sheet[r][c] = sum;
    for (int i = 0; i <= r; i++) {
      for (int j = 0; j <= c; j++) {
        System.out.printf(j < c ? "%d " : "%d%n", sheet[i][j]);
      }
    }
  }

}