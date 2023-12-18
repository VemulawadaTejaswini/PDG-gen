import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String args[]) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArray = br.readLine().split(" ");
        
        Stack<Integer> stack = new Stack<Integer>();
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals("+")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(b + a);
                continue;
            }
            
            if (inputArray[i].equals("-")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(b - a);
                continue;
            }
            
            if (inputArray[i].equals("*")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(b * a);
                continue;
            }
            
            stack.push(Integer.parseInt(inputArray[i]));
        }
        System.out.println(stack.pop());
    }
}
