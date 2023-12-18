import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) System.out.println(stack.poll());
            else stack.push(n);
        }

        while (stack.size() != 0) {
            System.out.println(stack.poll());
        }
    }
}
