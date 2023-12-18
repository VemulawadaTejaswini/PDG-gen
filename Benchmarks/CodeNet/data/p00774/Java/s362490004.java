import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int h = sc.nextInt();
      if (h == 0) return;
      int cell[][] = new int [h][5];
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < 5; j++) {
          cell[i][j] = sc.nextInt();
        }
      }
      int score = 0;
      /* 00000
         11111
         22222 */

      boolean flag;
      while (true) {
        flag = false;
        for (int i = 0; i < h; i++) {
          int num = cell[i][2];
          int count = 1;
          for (int j = 1; j >= 0 && cell[i][j] == num && cell[i][j] != 0; j--) count++;
          for (int j = 3; j < 5  && cell[i][j] == num && cell[i][j] != 0; j++) count++;
          if (count >= 3) {
            score += num * count;
            flag = true;
            cell[i][2] = 0;
            for (int j = 1; j >= 0 && cell[i][j] == num; j--) cell[i][j] = 0;
            for (int j = 3; j < 5  && cell[i][j] == num; j++) cell[i][j] = 0;
          }
        }
/*
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < 5; j++) {
            System.out.print(" ");
            System.out.print((cell[i][j] == 0 ? " " : cell[i][j]));
          }
          System.out.println();
        }
        System.out.println();
*/

        if (!flag) break;

        for (int n = 0; n < h; n++) {
          for (int i = h-1; i >= 1; i--) {
            for (int j = 0; j < 5; j++) {
              if (cell[i][j] == 0) {
                for (int k = i; k >= 0; k--) {
                  if (k == 0) cell[k][j] = 0;
                  else {
                    cell[k][j] = cell[k-1][j];
                    cell[k-1][j] = 0;
                  }
                }
              }
            }
          }
        }
/*
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < 5; j++) {
            System.out.print(" ");
            System.out.print((cell[i][j] == 0 ? " " : cell[i][j]));
          }
          System.out.println();
        }
        System.out.println();
        */
      }
      System.out.println(score);
    }
  }
}

