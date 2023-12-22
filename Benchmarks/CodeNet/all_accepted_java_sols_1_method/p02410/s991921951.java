import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),m=sc.nextInt();
    int[][] a = new int[n][m];   //メモリの動的確保
    int[] b = new int[m];
    int[] r = new int[n];
    for(int i=0;i < n;i++){
      for(int j=0;j < m;j++){
        a[i][j] = sc.nextInt();
      }
    }
    for(int j = 0;j < m;j++){
      b[j] = sc.nextInt();
    }
    for(int i = 0;i < n;i++){
      r[i] = 0;
      for(int j = 0;j < m;j++){
        r[i] += a[i][j]*b[j];
      }
      System.out.println(r[i]);
    }
    sc.close();
  }
}
