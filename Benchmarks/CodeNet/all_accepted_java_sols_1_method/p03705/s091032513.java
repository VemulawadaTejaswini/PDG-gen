import java.util.*;

public class Main {                   
    
  public static void main(String[] args) {                     
      
      Scanner sc = new Scanner(System.in);
      
      long N = sc.nextLong();
      long A = sc.nextLong();
      long B = sc.nextLong();
      
     if(A > B || (N == 1 && A != B)){
         System.out.println(0);
         return;
     }
  
     System.out.println((N-2)*(B-A) + 1);
     
      
  }   
   
}
        
        