import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int d = sc.nextInt();
    int[][] x = new int[n][d];
    double buf[][] = new double[n][n];
    int ans = 0;

    for(int i = 0; i < n; i++){
      for(int j = 0; j < d; j++){
        x[i][j] = sc.nextInt();
      }
    }

    for(int i = 0; i < n - 1; i++){
      for(int k = 1; i + k < n; k++){
        for(int j = 0; j < d; j++){
        buf[i][i + k] +=  (x[i][j] - x[i + k][j]) * (x[i][j] - x[i + k][j]);
        }
      }
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if((buf[i][j] != 0) &&(Math.sqrt(buf[i][j]) % 1 == 0)){
          ans += 1;
        }
      }
    }

    System.out.println(ans);
    
  }
}
