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
        int index = sumB.length - 1;
        for (int i = 0; i < sumA.length; i++) {
            long remain = k - sumA[i];
            for (int j = index; 0 <= j; j--) {
                if (sumB[j] <= remain) {
                    pq.add(i + j);
                    index = j;
                    break;
                }
            }
        }
        int result = pq.poll();

        // 出力
        System.out.println(result);
    }
}
