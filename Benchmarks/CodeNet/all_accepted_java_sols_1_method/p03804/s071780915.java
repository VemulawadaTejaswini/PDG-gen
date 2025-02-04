import java.util.*;
public class Main{
  static int n, m;
  static boolean[][] a, b;
 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    a = new boolean[n][n];
    
    for(int i = 0; i < n; i++){
      String line = sc.next();
      for(int j = 0; j < n; j++){
        if(line.charAt(j) == '#'){
          a[i][j] = true;
        }
      }
    }
    b = new boolean[m][m];
    for(int i = 0; i < m; i++){
      String line = sc.next();
      for(int j = 0; j < m; j++){
        if(line.charAt(j) == '#'){
          b[i][j] = true;
        }
      }
    }
    
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(i + m - 1 >= n || j + m - 1 >= n){
          continue;
        }
        boolean match = true;
        for(int k = 0; k < m; k++){
          for(int l = 0; l < m; l++){
            if(a[i + k][j + l] != b[k][l]){
              match = false;
              break;
            }
          }
        }
        if(match){
          System.out.println("Yes");
          return;
        }
      }
    }
 
    System.out.println("No");
    sc.close();
  }
}
