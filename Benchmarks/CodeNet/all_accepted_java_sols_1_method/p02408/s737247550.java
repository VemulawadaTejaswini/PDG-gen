import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[][] card = new int[4][13];
    int n = in.nextInt();

    for (int i = 0; i < n ; i++) {
      String s = in.next();
      int r = in.nextInt();
      if (s.equals("S")) {
        card[0][r - 1] = 1;
      }
      else if (s.equals("H")) {
        card[1][r - 1] = 1;
      }
      else if (s.equals("C")) {
        card[2][r - 1] = 1;
      }
      else if (s.equals("D")) {
        card[3][r - 1] = 1;
      }
    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 13; j++) {
        if (card[i][j] == 0) {
          if (i == 0) {
            System.out.println("S " + (j + 1));
          }
          else if (i == 1) {
            System.out.println("H " + (j + 1));
          }
          else if (i == 2) {
            System.out.println("C " + (j + 1));
          }
          else if (i == 3) {
            System.out.println("D " + (j + 1));
          }
        }
      }
    }
  }
}