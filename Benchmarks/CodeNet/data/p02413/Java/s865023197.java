import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int r = Integer.parseInt(s[0]);
    int c = Integer.parseInt(s[1]);
    int rPlus1 = r + 1;
    int cPlus1 = c + 1;
    int t[][] = new int[rPlus1][cPlus1];
    for (int i = 0; i < r; i++) {
      t[i][c] = 0;
      for (int j = 0; j < c; j++) {
        t[i][j] = sc.nextInt();
        t[i][c] += t[i][j];
        t[r][j] += t[i][j];
        t[r][c] += t[i][j];
      }
    }
    for (int[] row : t) {
      for (int column : row) {
        System.out.print(column + " ");
      }
      System.out.println();
    }
  }
}