import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer>stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
 
        String input = scan.nextLine();
        String[] S = input.split(" ");
        scan.close();
 
        for(int i = 0; i < S.length; i++) {
            if (S[i].equals("+")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y + x);
            }
            else if (S[i].equals("-")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y - x);
            }
            else if (S[i].equals("*")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x * y);
            }
            else {
                stack.push(Integer.parseInt(S[i]));
            }
        }
        System.out.println(stack.firstElement());
    }
}
