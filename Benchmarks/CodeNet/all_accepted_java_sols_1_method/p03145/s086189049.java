import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int semi = (a + b + c) / 2;
      System.out.println((int)Math.sqrt(semi * (semi - a) * (semi - b) * (semi - c)));
   }
}