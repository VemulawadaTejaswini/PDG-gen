import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String curr = "A";
      
      while(sc.hasNext()) {
         String[] input = sc.nextLine().split(",");
         String p1 = input[0];
         String p2 = input[1];
         
         if(p1.equals(curr)) {
            curr = new String(p2);
         } else if (p2.equals(curr)) {
            curr = new String(p1);
         }
         
      }
      
      System.out.println(curr);
   }
}
