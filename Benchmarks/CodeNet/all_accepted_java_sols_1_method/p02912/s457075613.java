import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) pq.add(in.nextLong());
        for (int i = 0; i < M; i++) {
            long v = pq.poll();
            pq.add(v >> 1);
        }
        long ans = 0L;
        for (long v : pq.toArray(new Long[0])) {
            ans += v;
        }
        System.out.println(ans);
    }
}
