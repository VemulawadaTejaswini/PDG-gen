import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            pq.add(a);
            pq.add(a);
        }
        sc.close();

        // 主処理
        pq.poll();
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            result += pq.poll();
        }

        // 出力
        System.out.println(result);
    }
}
