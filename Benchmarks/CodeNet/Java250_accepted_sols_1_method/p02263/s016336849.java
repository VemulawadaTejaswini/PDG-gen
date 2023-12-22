import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        String st;
        Stack<Integer> stack = new Stack<Integer>();
        while (input.hasNext()) {                        
            st = input.next();
            if (Character.isDigit(st.charAt(0))) stack.push(Integer.parseInt(st));
            else {
                int x = stack.pop();
                int y = stack.pop();
                if (st.equals("+")) stack.push(x + y);
                else if (st.equals("-")) stack.push(y - x);
                else if (st.equals("*")) stack.push(y * x);
            }
        }
        System.out.println(stack.pop());
    }            
}