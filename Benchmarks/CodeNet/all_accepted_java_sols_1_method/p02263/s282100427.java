import java.util.Arrays;
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        while (in.hasNext()) {
            if (in.hasNextInt())
                stack.push(in.nextInt());
            else {
                int total = stack.pop();
                switch(in.next()) {
                    case "+": total += stack.pop();
                        break;
                    case "-": total = stack.pop() - total;
                        break;
                    case "*": total *= stack.pop();
                        break;
                }
                stack.push(total);
            }
        }
    System.out.println(stack.pop());
    }
}

