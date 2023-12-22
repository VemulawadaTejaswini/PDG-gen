import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] v = new int[N];
            for (int i = 0; i < N; i++) {
                v[i] = in.nextInt();
            }

            PriorityQueue<Double> pq = new PriorityQueue<Double>();
            for (int i = 0; i < N; i++) {
                pq.add((double) v[i]);
            }
            for (; pq.size() > 1;) {
                double d = pq.poll();
                double d2 = pq.poll();
                pq.add((d + d2) / 2);
            }

            System.out.println(pq.poll());
        }
    }
}
