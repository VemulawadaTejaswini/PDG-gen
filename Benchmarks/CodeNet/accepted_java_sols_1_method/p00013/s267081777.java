import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println(stack.pop());
            } else {
                stack.push(n);
            }
        }
    }
}
