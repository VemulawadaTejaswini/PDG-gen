import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        long[] sumA = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            sumA[i] = sumA[i - 1] + Long.parseLong(sc.next());
        }
        long[] sumB = new long[m + 1];
        for (int i = 1; i <= m; i++) {
            sumB[i] = sumB[i - 1] + Long.parseLong(sc.next());
        }
        sc.close();

        // 主処理
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = sumA.length - 1; 0 <= i; i--) {
            if (k <= sumA[i]) {
                continue;
            }
            for (int j = sumB.length - 1; 0 <= j; j--) {
                if (sumA[i] + sumB[j] <= k) {
                    pq.add(i + j);
                    break;
                }
            }
        }
        int result = pq.poll();

        // 出力
        System.out.println(result);
    }
}
