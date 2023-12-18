import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r,c,count;
    r = sc.nextInt();
    c = sc.nextInt();
    int[][] cells = new int[r+1][c+1];
    for(int i=0;i <= r;i++)cells[i][c] = 0;
    for(int j=0;j <= c;j++)cells[r][j] = 0;
    for(int i=0;i < r;i++){
      for(int j=0;j < c;j++){
        cells[i][j] = sc.nextInt();
        cells[i][c] += cells[i][j];
        cells[r][j] += cells[i][j];
        cells[r][c] += cells[i][j];
      }
    }
    for(int i=0;i <= r;i++){
      for(int j=0;j <= c;j++){
        System.out.print(cells[i][j]);
        if(j != c)System.out.print(" ");
      }
      System.out.println("");
    }
    sc.close();
  }
}

