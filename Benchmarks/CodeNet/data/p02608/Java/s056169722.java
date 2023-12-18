import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int N = 0;
    int count = 0;
 
    if(n>=1 && n<=10000){
    
     int x = 1;
     int y = 1;
     int z = 1;  
     int ans = 0;
     
    for(int i = 1; i <= n ; i++){
      N = i;  
        for(int j = 1; j < 100  ; j++){
          x = j;
          for(int k = 1; k < 100 ; k++){
            y = k;
            for(int l = 1; l < 100 ; l++){
              z = l;    
              ans = x*x + y*y + z*z + x*y + y*z + z*x;
              if(ans == N){
                count++;
              }
            }
         }  
      }
      System.out.println(count);
      count = 0;
     }
      
    }else{
      System.out.println("入力条件に違反しています");
    }
  } 
}