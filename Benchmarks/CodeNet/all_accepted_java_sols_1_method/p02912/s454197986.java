import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(sc.next()));
        }

        while (m > 0) {
            pq.add(pq.poll() / 2);
            m--;
        }

        long result = 0;
        for (int a : pq) {
            result += a;
        }

        System.out.println(result);
    }
}
