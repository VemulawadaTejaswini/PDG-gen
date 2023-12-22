import java.util.*;

public class Main {                   
    
  public static void main(String[] args) {                     
      
      Scanner sc = new Scanner(System.in);
      
      long Q = sc.nextLong();
      long H = sc.nextLong();
      long S = sc.nextLong();
      long D = sc.nextLong();      
      
      long N = sc.nextLong();
      
      long one = Math.min(S,Math.min(Q*4,H*2));
      
      long two = Math.min(D,one*2);
      
      if(N%2 == 1){          
        System.out.println(N/2*two + one);
        return;
      }else{
        System.out.println(N/2*two);
        return;
      }
  
      
  }   
   
}
        