import java.util.*;

class Main{
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] matrix = new int[n][m];
      int[] retu = new int[m];
      int[] ans = new int[n];
      for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
          matrix[i][j] = sc.nextInt();
        }
      }
      for(int i = 0; i<m; i++){
        retu[i] = sc.nextInt();   
      }
      for(int i = 0; i<n; i++) {
        for(int j =0; j<m; j++) {
          ans[i] += matrix[i][j] * retu[j];
        }
      }
      for (int i = 0; i<n; i++) {
        System.out.println(ans[i]);
    }
  }
}
