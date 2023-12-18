import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static int evalRPN(String input){
        int totalValue = 0;
        String operators = "+-*/";
        String inputArray[] = input.split(" ");
        Stack<String> stack = new Stack<>();

        for(String t : inputArray){
            if(!operators.contains(t)){
                stack.push(t);
            } else {
                int y = Integer.valueOf(stack.pop());
                int x = Integer.valueOf(stack.pop());
                switch (t){
                    case "+":
                        stack.push(String.valueOf(x + y));
                        break;
                    case "-":
                        stack.push(String.valueOf(x - y));
                        break;
                    case "*":
                        stack.push(String.valueOf(x * y));
                        break;
                    case "/":
                        stack.push(String.valueOf(x / y));
                        break;
                }
            }
        }
        return Integer.valueOf(stack.pop());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        System.out.println(evalRPN(inputString));

        in.close();
    }

}

