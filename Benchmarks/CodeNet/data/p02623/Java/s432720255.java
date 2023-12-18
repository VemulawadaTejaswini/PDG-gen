import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        // Deque<Integer> a = new ArrayDeque<>();
        long[] sumA = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            // a.add(Integer.parseInt(sc.next()));
            sumA[i] = sumA[i - 1] + Long.parseLong(sc.next());
        }
        // Deque<Integer> b = new ArrayDeque<>();
        long[] sumB = new long[m + 1];
        for (int i = 1; i <= m; i++) {
            // b.add(Integer.parseInt(sc.next()));
            sumB[i] = sumB[i - 1] + Long.parseLong(sc.next());
        }
        sc.close();

        // 主処理
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < sumA.length; i++) {
            for (int j = 0; j < sumB.length; j++) {
                if (sumA[i] + sumB[j] <= k) {
                    pq.add(i + j);
                }
            }
        }
        int result = pq.poll();

        // 出力
        System.out.println(result);
    }
}
