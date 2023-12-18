import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int N = 0;
    int count = 0;
 
    for(int i = 1; i <= n ; i++){
      N = i;
      int x = 1;
      int y = 1;
      int z = 1;     
        for(int j = 1; j <= n  ; j++){
          x = j;
          for(int k = 1; k <= n ; k++){
            y = k;
            for(int l = 1; l <= n ; l++){
              z = l;    
              if(x*x + y*y + z*z + x*y + y*z + z*x == N){
                count++;
              }
            }
         }  
      }
      System.out.println(count);
      count = 0;
     }
  } 
}