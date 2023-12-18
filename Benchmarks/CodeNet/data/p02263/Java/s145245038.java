import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    static Stack<Integer> stack;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        stack = new Stack<>();
        stack.push(sc.nextInt());
        while(sc.hasNext()) {
            String input = sc.next();
            switch(input.charAt(0)) {
                case '+':
                calculate('+');
                break;
                case '-':
                calculate('-');
                break;
                case '*':
                calculate('*');
                break;
                default:
                stack.push(Integer.parseInt(input));
            }
        }

        System.out.println(stack.pop());

        sc.close();
    }

    private static void calculate(char ope) {
        int y = stack.pop();
        int x = stack.pop();
        switch(ope) {
            case '+':
            stack.push(x + y);
            break;
            case '-':
            stack.push(x - y);
            break;
            case '*':
            stack.push(x * y);
        }
    }
}
