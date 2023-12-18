import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int N = sc.nextInt();
    
    int[][] a = new int[3][N];
    int min_x = 0;
    int max_x = W;
    int min_y = 0;
    int max_y = H;
    for(int i = 0; i < N; i++){
      a[0][i] = sc.nextInt();
      a[1][i] = sc.nextInt();
      a[2][i] = sc.nextInt();
      /*System.out.println(a[0][i]);
      System.out.println(a[1][i]);
      System.out.println(a[2][i]);*/
    }
    
    for(int i = 0; i < N; i++){
      if(a[2][i] == 1){
        min_x = Math.max(min_x, a[0][i]);
      }
      if(a[2][i] == 2){
        max_x = Math.min(max_x, a[0][i]);
      }
      if(a[2][i] == 3){
        min_y = Math.max(min_y, a[1][i]);
      }
      if(a[2][i] == 4){
        max_y = Math.min(max_y, a[1][i]);
      }
    }
 
    int x = max_x - min_x;
    int y = max_y - min_y;
    
    //System.out.println(x);
    //System.out.println(y);
    
    if(x <= 0 || y <= 0){
      System.out.println(0);
    }else{
      System.out.println(x*y);
    }
  }
}