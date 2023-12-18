import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      long c = a * b;
      
      if((c % 2) == 0){
          System.out.println("Even");
      }else if((c % 2) != 0){
          System.out.println("Odd");
      }
    }
}
