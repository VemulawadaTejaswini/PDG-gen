import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][][] dormitory = new int[4][3][10];
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int b = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      int v = sc.nextInt();
      dormitory[b - 1][f - 1][r - 1] += v;
    }
    sc.close();
    for (int i = 0; i < dormitory.length; i++) {
      for (int j = 0; j < dormitory[i].length; j++) {
        for (int k = 0; k < dormitory[i][j].length; k++) {
          System.out.printf(" %d", dormitory[i][j][k]);
        }
        System.out.println();
      }
      if (i != 3)
        System.out.println("####################");
    }
  }
}
