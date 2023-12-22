import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int D = scan.nextInt();
    int X[][] = new int[N][D];
    int count = 0;
    
    for (int i = 0; i < N; i++){
      for(int j = 0; j < D; j++){
        X[i][j] = scan.nextInt();
      }
      
      for(int k = 0; k < i; k++){
        int kyori = 0;
        for(int j = 0; j < D; j++){
          kyori += (X[i][j]-X[k][j])*(X[i][j]-X[k][j]);
        }
        for(int l = 1; l*l <= kyori; l++){
          if(l*l == kyori){
            count++;
          }
        }
      }
    }
    
    System.out.println(count);
  }
}