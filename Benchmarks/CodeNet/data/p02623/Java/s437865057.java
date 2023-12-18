import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Deque<Integer> a = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }
        Deque<Integer> b = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            b.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        // 主処理
        int result = 0;
        while (0 <= k) {
            if (a.isEmpty()) {
                while (0 <= k && !b.isEmpty()) {
                    k -= b.pollFirst();
                    result++;
                }
                break;
            } else if (b.isEmpty()) {
                while (0 <= k && !a.isEmpty()) {
                    k -= a.pollFirst();
                    result++;
                }
                break;
            } else if (a.peekFirst() <= b.peekFirst()) {
                k -= a.pollFirst();
                result++;
            } else {
                k -= b.pollFirst();
                result++;
            }
        }
        if (k < 0) {
            result--;
        }

        // 出力
        System.out.println(result);
    }
}
