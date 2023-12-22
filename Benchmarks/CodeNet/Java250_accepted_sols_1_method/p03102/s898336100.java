import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int[] b = new int[m];
    for(int i = 0;i<m;i++){
      b[i] = sc.nextInt();
    }
    int[][] a = new int[n][m];
    for(int i = 0;i<n;i++){
      for(int j = 0;j<m;j++){
        a[i][j] = sc.nextInt();
      }
    }
    int count = 0;
    for(int i = 0;i<n;i++){
      int code = c;
      for(int j = 0;j<m;j++){
        code += a[i][j]*b[j];
      }
      if(code>0)count++;
    }
    System.out.println(count);
  }
}
