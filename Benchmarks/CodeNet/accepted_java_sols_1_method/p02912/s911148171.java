import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue queue = new PriorityQueue(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            queue.add((int) queue.poll() / 2);
        }

        long answer = 0;
        for (int i = 0; i < n; i++) {
            answer += (int) queue.poll();
        }

        System.out.println(answer);

    }
}
