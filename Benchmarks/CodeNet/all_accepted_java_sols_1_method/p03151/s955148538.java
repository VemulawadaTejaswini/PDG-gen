import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        Long[] b = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        for (int i = 0; i < n; i++) {
            b[i] = Long.parseLong(sc.next());
        }
        sc.close();

        // 主処理
        long sumA = Arrays.stream(a).mapToLong(i -> i).sum();
        long sumB = Arrays.stream(b).mapToLong(i -> i).sum();

        int result = 0;
        if (sumA < sumB) {
            result = -1;
        } else {
            PriorityQueue<Long> overNumberQueue = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Long> lackNumberQueue = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                long diff = a[i] - b[i];
                if (0 < diff) {
                    overNumberQueue.add(diff);
                } else if (diff < 0) {
                    lackNumberQueue.add(diff * -1);
                }
            }
            long over = 0;
            while (!lackNumberQueue.isEmpty()) {
                long lack = lackNumberQueue.poll();
                over -= lack;
                result++;
                while (over < 0) {
                    over += overNumberQueue.poll();
                    result++;
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
