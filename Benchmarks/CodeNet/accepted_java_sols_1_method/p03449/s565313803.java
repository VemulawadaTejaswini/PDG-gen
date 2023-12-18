import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = 0;
    int[][] a = new int[2][n];
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < n; j++){
        a[i][j] = sc.nextInt();
      }
    }
    for(int i = 0; i < n; i++){
      int count = 0;
      for(int j = 0; j < n; j ++){
        if(i == j){
          count += a[0][j] + a[1][j];
        }else if(i > j){
          count += a[0][j];
        }else{
          count += a[1][j];
        }
      }
      max = Math.max(max, count);
    }
    System.out.println(max);
  }
}