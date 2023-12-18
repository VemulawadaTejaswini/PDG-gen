import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      ArrayDeque<Integer> stack = new ArrayDeque<>();
      
      while(sc.hasNext()) {
         int command = Integer.parseInt(sc.nextLine());
         if(command == 0) {
            System.out.println(stack.pop());
         } else {
            stack.push(command);
         }
      }
   }
}
