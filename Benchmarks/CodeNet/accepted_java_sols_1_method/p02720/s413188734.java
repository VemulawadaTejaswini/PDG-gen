import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Deque<Long> queue = new ArrayDeque<>();
        for (long i = 1; i <= 9; i++) {
            queue.add(i);
        }
        for (int i = 0; i < k - 1; i++) {
            long x = queue.remove();
            long n = 10 * x + x % 10;
            if (x % 10 != 0) {
                queue.add(n - 1);
            }
            queue.add(n);
            if (x % 10 != 9) {
                queue.add(n + 1);
            }
        }
        System.out.println(queue.remove());
    }
}
