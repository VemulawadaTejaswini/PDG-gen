import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
    private static final long MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        int[] cnt = new int[n + 1];
        int[] cnt2 = new int[n + 1];

        int[] start = new int[n + 1];
        Arrays.fill(start, -1);

        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            ++cnt2[a[i]];
        }
        for (int i = 0; i < n; ++i) {
            b[i] = in.nextInt();
            if (a[i] == b[i]) {
                ++cnt[a[i]];
                if (start[a[i]] == -1) start[a[i]] = i;
            }
            ++cnt2[b[i]];
        }
        for (int i = 0; i <= n; ++i) {
            if (cnt2[i] > n) {
                System.out.println("No");
                return;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 1; i <= n; ++i) {
            if (cnt[i] != 0) pq.add(new Pair(i, cnt[i]));
        }
        while (pq.size() > 1) {
            Pair p1 = pq.poll();
            Pair p2 = pq.poll();

            int i1 = start[p1.val];
            int i2 = start[p2.val];

            b[i1] = p2.val;
            b[i2] = p1.val;

            p1.cnt--;
            p2.cnt--;

            start[p1.val]++;
            start[p2.val]++;

            if (p1.cnt != 0) pq.add(p1);
            if (p2.cnt != 0) pq.add(p2);
        }
        if (!pq.isEmpty()) {
            Pair p = pq.poll();
            int x = p.val;
            int i = 0;
            while (i < n && p.cnt != 0) {
                if (b[i] != x && x != a[i]) {
                    int temp = b[i];
                    b[i] = x;
                    b[start[x]] = temp;
                    start[x]++;
                    p.cnt--;
                }
                ++i;
            }
        }
        System.out.println("Yes");
        for (int i = 0; i < n; ++i) {
            System.out.print(b[i] + " ");
        }
    }

    static class Pair implements Comparable<Pair> {
        int val, cnt;

        Pair(int val, int cnt) {
            this.val = val;
            this.cnt = cnt;
        }

        public int compareTo(Pair p) {
            return p.cnt - this.cnt;
        }
    }
}