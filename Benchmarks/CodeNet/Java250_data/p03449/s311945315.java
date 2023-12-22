import java.util.*;

class Main { 
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] a = new int[2][n];
      for(int i = 0; i < 2; i++){
          for(int j = 0; j < n; j++){
              a[i][j] = sc.nextInt();
          }
      }
      
      int maxCnt = 0;
      for(int i = 0; i < n; i ++){
          int tmp = 0;
          for(int j = 0; j <= i; j++){
              tmp = tmp + a[0][j];
          }
          for(int k = i; k < n; k++){
              tmp = tmp + a[1][k];
          }
          
          if(tmp > maxCnt) {
              maxCnt = tmp;
          }
      }
      
      System.out.println(maxCnt);
  }  
}