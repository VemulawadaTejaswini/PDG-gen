import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import static java.util.Collections.reverseOrder;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Long> a = new PriorityQueue<>(reverseOrder());
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        for (int i = 0; i < m; i++) {
            long polled = a.poll();
            a.add(polled / 2);
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.poll();
        }
        System.out.println(sum);
    }

}
