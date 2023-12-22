import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] c = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        c[i][j] = scanner.nextInt();
      }
    }

    int c012 = c[0][0] + c[1][1] + c[2][2];
    int c021 = c[0][0] + c[1][2] + c[2][1];
    int c102 = c[0][1] + c[1][0] + c[2][2];
    int c120 = c[0][1] + c[1][2] + c[2][0];
    int c210 = c[0][2] + c[1][1] + c[2][0];
    int c201 = c[0][2] + c[1][0] + c[2][1];

    if (c012 == c021 && c021 == c102 && c102 == c120 && c120 == c210 && c210 == c201) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
