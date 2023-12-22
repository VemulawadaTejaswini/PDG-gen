import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    A--;
    B--;

    int[][] grids = new int[100][100];
    for (int i = 0; i < 50; i++) for (int j = 0; j < 100; j++) grids[i][j] = 1;

    for (int i = 1; i < 50 && A > 0; i += 2) {
      for (int j = 1; j < 99 && A > 0; j += 2) {
        grids[i][j] = 0;
        A--;
      }
    }
    for (int i = 51; i < 100 && B > 0; i += 2) {
      for (int j = 1; j < 99 && B > 0; j += 2) {
        grids[i][j] = 1;
        B--;
      }
    }

    System.out.println("100 100");
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) System.out.print(grids[i][j] == 0 ? '.' : '#');
      System.out.println();
    }
  }
}
