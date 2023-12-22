import java.util.Scanner;
import java.util.Stack;
 
public class Main {
        public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
                Stack<Integer> stack = new Stack<Integer>();
                while (scn.hasNext()) {
                   int n = scn.nextInt();
                   if (n == 0) {
                       System.out.println(stack.pop());
                   } else {
                       stack.push(n);
                   }
            }
     }
}