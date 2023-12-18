import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if(!stack.isEmpty() && stack.peek() != num) {
                count += 2;
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        System.out.println(count);
    }
}
