import java.util.Scanner;
import java.util.Arrays;
import java.util.StringJoiner;
// import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dataString = scanner.nextLine().split(" ");
        
        //Stack<String> stack = new Stack<>();
        Stack stack = new Stack();
        
        for (String s : dataString) {
            int a;
            int b;
            switch (s) {
            case "+":
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(a + b));
                break;
            case "-":
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b - a));
                break;
            case "*":
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(a * b));
                break;
            default:
                stack.push(s);
                break;
            
            }
        }
        
        System.out.println(stack.pop());
    }
    
    private static class Stack {
        private int top = 0;
        private String[] data = new String[200];
        
        public String pop() {
            top--;
            return data[top];
            
        }
        
        public void push(String s) {
            data[top] = s;
            top++;
        }
    }
}
