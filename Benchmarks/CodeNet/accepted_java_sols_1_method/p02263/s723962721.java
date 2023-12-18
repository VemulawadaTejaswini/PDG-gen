import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().trim().split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("+")) {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                int i1 =pop1 +pop2;
                stack.push(i1);
            }
            else if (split[i].equals("-")) {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                int i1 =pop2 -pop1;
                stack.push(i1);
            }
           else if (split[i].equals("*")) {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                int i1 =pop1 *pop2;
                stack.push(i1);
            }else {
                stack.push(Integer.parseInt(split[i]));
            }
        }
        System.out.println(stack.pop());
    }

}
