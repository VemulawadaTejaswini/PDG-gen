import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] vs = new int[n];
        for (int i = 0; i < n; i++) {
            vs[i] = std.nextInt();
        }

        double ans = 0;

        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add((double) vs[i]);
        }

        while (!pq.isEmpty()) {
            double first = pq.poll();
            if (pq.isEmpty()) {
                ans = first;
                break;
            }
            double second = pq.poll();

            ans = (first + second) / 2.0;
            pq.add(ans);
        }

        System.out.println(ans);
    }
}
