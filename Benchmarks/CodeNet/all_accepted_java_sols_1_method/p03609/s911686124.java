import java.util.*;

public class Main {
    
  public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);                      
                   
      long X = sc.nextLong();
      long t = sc.nextLong();
      
      if(X - t <= 0){
          System.out.println(0);
          return;
      }else{
          System.out.println(X - t);
          return;
      }
  }            
    
}
    

