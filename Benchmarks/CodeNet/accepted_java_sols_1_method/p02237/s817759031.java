import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] A = new int[n][n];
    for(int i = 0;i < n;i++){
      for(int j = 0;j < n;j++){
        A[i][j] = 0;
      }
    }
    for(int i = 0;i < n;i++){
      int u = sc.nextInt();
      int k = sc.nextInt();
      int v = 0;
      for(int j = 0;j < k;j++){
        v = sc.nextInt();
         A[u - 1][v - 1] = 1;
      }
      }

    for(int i = 0;i < n;i++){
      for(int j = 0;j < n;j++){
        if(j != n - 1)System.out.print(A[i][j]+" ");
        else System.out.println(A[i][j]);
      }     
  }
}
}
