import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String c = sc.next();
        PriorityQueue<Integer> w = new PriorityQueue<>();
        PriorityQueue<Integer> r = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (c.charAt(i) == 'W') {
                w.add(i);
            } else {
                r.add(i);
            }
        }
        if (w.isEmpty() || r.isEmpty()) {
            System.out.println(0);
            return;
        }
        int cnt = 0;
        while (true) {
            if (w.isEmpty() || r.isEmpty()) {
                System.out.println(cnt);
                return;
            }
            int ww = w.poll();
            int rr = r.poll();
            if (ww > rr) {
                System.out.println(cnt);
                return;
            }
            cnt++;
        }
    }
}