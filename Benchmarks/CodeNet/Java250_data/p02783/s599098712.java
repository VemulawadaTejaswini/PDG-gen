import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      double H =sc.nextDouble();
      double A =sc.nextDouble();
        
      //切り上げ
      System.out.println((int)Math.ceil(H /A));      
        
    }
}