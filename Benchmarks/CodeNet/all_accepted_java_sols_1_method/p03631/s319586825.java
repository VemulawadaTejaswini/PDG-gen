import java.util.*;
import java.math.*;

class Main{       
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
    
      int N = sc.nextInt();
      
      String S = String.valueOf(N);
      
      if(S.charAt(0) == S.charAt(2)){
          System.out.println("Yes");
          return;
      }else{
          System.out.println("No");          
          return;
      }
      
   }
}
        