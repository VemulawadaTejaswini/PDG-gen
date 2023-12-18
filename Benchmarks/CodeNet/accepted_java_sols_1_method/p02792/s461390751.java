
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    int[][] a = new int[9][9];
    int count = 0;

    for (int i = 1; i <= n; i++) {
      char[] cs = String.valueOf(i)
          .toCharArray();
      int t = Character.getNumericValue(cs[cs.length - 1]);
      if (t != 0) {
        int h = Character.getNumericValue(cs[0]);
        a[h - 1][t - 1]++;
//        System.out.println(h + " " + t);
      }
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        count += a[i][j] * a[j][i];

      }
    }
    System.out.println(count);
  }
}
