import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayDeque<Long> deq = new ArrayDeque<>();
        for (long i = 1; i <= 9; i++) {
            deq.add(i);
        }
        for (int i = 1; i < n; i++) {
            long x = deq.poll();
            if (x % 10 != 0) {
                deq.add(x * 10 + x % 10 - 1);
            }
            deq.add(x * 10 + x % 10);
            if (x % 10 != 9) {
                deq.add(x * 10 + x % 10 + 1);
            }
        }
        System.out.println(deq.poll());
    }
}
