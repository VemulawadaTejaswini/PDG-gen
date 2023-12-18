import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] bingo = new int[3][3];
    int cnt = 0;
    int ok = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        bingo[i][j] = sc.nextInt();
      }
    }
    int numbers = sc.nextInt();
    for (int i = 0; i < numbers; i++) {
      int number = sc.nextInt();
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if (bingo[j][k] == number) {
            bingo[j][k] = 0;
          }
        }
      }
    }
    // 横判定
    for (int i = 0; i < 3; i++) {
      cnt = 0;
      for (int j = 0; j < 3; j++) {
        if (bingo[i][j] == 0) {
          cnt++;
        }
      }
      if (cnt == 3) {
        ok++;
      }
    }
    // 縦判定

    for (int i = 0; i < 3; i++) {
      cnt = 0;
      for (int j = 0; j < 3; j++) {
        if (bingo[j][i] == 0) {
          cnt++;
        }
      }
      if (cnt == 3) {
        ok++;
      }
    }

    // 斜め判定1
    if (bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0) {
      ok++;
    }
    // 斜め判定2
    if (bingo[0][2] == 0 && bingo[1][1] == 0 && bingo[2][0] == 0) {
      ok++;
    }
    if (ok > 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
