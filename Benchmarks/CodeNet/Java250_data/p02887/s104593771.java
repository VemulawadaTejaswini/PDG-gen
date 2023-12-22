import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String slims = in.next();
        Deque<Character> stack = new ArrayDeque<>();
        for (char c: slims.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            }
        }
        System.out.println(stack.size());
        in.close();
    }
}