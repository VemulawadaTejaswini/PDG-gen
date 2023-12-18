import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            pq.add(a);
            pq.add(a);
        }
        sc.close();

        // 主処理
        pq.poll();
        long result = 0;
        for (int i = 0; i < n - 1; i++) {
            result += pq.poll();
        }

        // 出力
        System.out.println(result);
    }
}
