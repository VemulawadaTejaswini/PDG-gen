import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue(n, Comparator.reverseOrder());
        for(int i = 0; i < n; i++){
            Long q = Long.parseLong(String.valueOf(in.nextInt()));
            pq.add(q);
        }
        for (int i = 1; i <= m; i++) {
            Long l = pq.poll() / 2L;
            pq.add(l);
        }
        Long result = 0L;
        int l = pq.size();
        for(int i = 0; i < l; i++) {
            result += pq.poll();

        }
        System.out.println(result);
    }
}
