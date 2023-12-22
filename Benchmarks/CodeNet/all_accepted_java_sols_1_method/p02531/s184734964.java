import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Stack<String> stack = new Stack<String>();
        for (String s = input.next(); !s.equals("quit"); s = input.next()){
            if (s.equals("push")){
                String c = input.next();
                stack.push(c);
            }
            else {
                System.out.println(stack.pop());
            }
        }
    }
}