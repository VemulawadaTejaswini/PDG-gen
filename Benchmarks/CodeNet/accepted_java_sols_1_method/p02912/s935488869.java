import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Powerful Discount Tickets
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));

            for (int i = 0; i < N; i++) {
                queue.add(sc.nextInt());
            }

            for (int i = 0; i < M; i++) {
                Integer poll = queue.poll();
                if (poll == 0) {
                    break;
                }

                queue.add(poll / 2);
            }

            long ans = 0;
            for (Integer p : queue) {
                ans += p;
            }

            System.out.println(ans);
        }
    }

}
