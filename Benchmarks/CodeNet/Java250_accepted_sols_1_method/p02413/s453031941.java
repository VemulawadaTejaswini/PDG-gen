import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int line;
    int row;
    int[][] matrix = new int[r + 1][c + 1];
    for(int i = 0; i < r; i++) {
      line = 0;
      for(int j = 0; j < c; j++) {
        matrix[i][j] = sc.nextInt();
        line += matrix[i][j];
      }
      matrix[i][c] = line;
    }
    for(int i = 0; i < c + 1; i++) {
      row = 0;
      for(int j = 0; j < r; j++) {
        row += matrix[j][i];
      }
      matrix[r][i] = row;
    }
    for(int i = 0; i < r + 1; i++) {
      for(int j = 0; j < c + 1; j++) {
        if(j == c) {
          System.out.println(matrix[i][j]);
        } else {
          System.out.print(matrix[i][j] + " ");
        }
      }
    }
  }
}

