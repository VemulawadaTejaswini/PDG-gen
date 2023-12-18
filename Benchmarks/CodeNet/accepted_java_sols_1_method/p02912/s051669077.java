import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Queue<Long> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(sc.next());
            q.add(num);
        }
        for (int i = 0; i < m; i++) {
            q.add(q.poll() / 2);
        }
        long ans = 0;
        for (long l : q) {
            ans += l;
        }
        System.out.println(ans);
    }
}