import java.util.*;

public class Main {
    public static void main(String args[]) {
            Stack<Integer> stack = new Stack<Integer>();
            int a, b;
            try (Scanner in = new Scanner(System.in)) {
                    while (in.hasNext()) {
                            String input = in.next();
                            if (input.charAt(0) == '+') {
                                    a = stack.pop().intValue();
                                    b = stack.pop().intValue();
                                    stack.push(a + b);
                            } else if(input.charAt(0) == '*'){
                            	a = stack.pop().intValue();
                                b = stack.pop().intValue();
                                stack.push(a * b);
                            } else if(input.charAt(0) == '-'){
                            	a = stack.pop().intValue();
                                b = stack.pop().intValue();
                                stack.push(b - a);
                            } else {
                                    stack.push(Integer.parseInt(input));
                            }
                    }
            }
            System.out.println(stack.peek());
    }
}
