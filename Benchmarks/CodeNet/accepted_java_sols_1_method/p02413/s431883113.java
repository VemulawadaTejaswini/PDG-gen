import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] table = new int[r][c];
    int[] sumColumn = new int[c];
    int sumAll = 0;

    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        table[i][j] = sc.nextInt();
      }
    }

    for(int i = 0; i < r; i++){
      int sumRow = 0;
      for(int j = 0; j < c; j++){
        System.out.print(table[i][j] + " ");
        sumRow += table[i][j];
      }
      System.out.println(sumRow);
    }

    for(int i = 0; i < c; i++){
      for(int j = 0; j < r; j++){
        sumColumn[i] += table[j][i];
      }
      sumAll += sumColumn[i];
      System.out.print(sumColumn[i] + " ");
    }
    System.out.println(sumAll);

  }
}


