import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] inputs = str.split(" ");

        Stack<Integer> operands = new Stack<>();

        for (String s : inputs) {
            if (s.equals("+") || s.equals("-") || s.equals("*")) {
                int i1 = operands.pop();
                int i2 = operands.pop();
                switch (s) {
                    case "+":
                        operands.push(i2+i1);
                        break;
                    case "-":
                        operands.push(i2-i1);
                        break;
                    case "*":
                        operands.push(i2*i1);
                        break;
                    default:
                        sc.close();
                        return;
                }
            } else {
                operands.push(Integer.parseInt(s));
            }
        }

        System.out.println(operands.pop());
        
        sc.close();
    }
}

