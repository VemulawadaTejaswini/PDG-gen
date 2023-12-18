import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String x : line) {
            char c = x.charAt(0);
            if (c == '+' || c == '-' || c == '*') {
                int second = stack.pop();
                int first = stack.pop();
                if (c == '+') {
                    first += second;
                } else if (c == '-') {
                    first -= second;
                } else {
                    first *= second;
                }
                stack.push(first);
            } else {
                stack.push(Integer.parseInt(x));
            }
        }
       System.out.println(stack.pop());
    }
}
