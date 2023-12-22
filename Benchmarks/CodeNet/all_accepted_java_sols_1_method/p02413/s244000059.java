import java.util.*;

class Main{
  static int r,c,a;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] matrix = new int[r+1][c+1];
    for (int i= 0; i<r; i++) {
      for (int j= 0; j<c; j++) {
        a = sc.nextInt();
        matrix[i][j] = a;
        matrix[r][j] += a;
        matrix[i][c] += a;
        matrix[r][c] += a;
      }
    }
    for (int i= 0; i<r+1; i++) {
      for (int j= 0; j<c+1; j++) {
        if (j != c) {
        System.out.print(matrix[i][j] + " ");
        } else {
          System.out.println(matrix[i][j]);
        }
      }
    }
  }
}
