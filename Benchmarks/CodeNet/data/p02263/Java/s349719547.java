import java.io.*;
import java.util.Stack;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] exp = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < exp.length; i++) {
            if (exp[i].equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (exp[i].equals("-")) {
                stack.push(-stack.pop() + stack.pop());
            } else if (exp[i].equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else {
                stack.push(Integer.parseInt(exp[i]));
            }
        }

        System.out.println(stack.pop());
    }
}