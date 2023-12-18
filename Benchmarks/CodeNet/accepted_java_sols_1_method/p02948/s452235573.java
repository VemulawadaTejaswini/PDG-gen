import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = std.nextInt();
            b[i] = std.nextInt();
        }

        List<List<Integer>> jobs = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            jobs.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int v = a[i];
            if (v > m) {
                continue;
            }
            jobs.get(m - v).add(b[i]);
        }

        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = m - 1; i >= 0; i--) {
            pq.addAll(jobs.get(i));

            if (!pq.isEmpty()) {
                ans += pq.poll();
            }
        }

        System.out.println(ans);
    }
}
