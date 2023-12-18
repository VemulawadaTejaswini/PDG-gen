import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        Deque<String> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                dq.addLast(Integer.toString(a[i]));
            } else {
                dq.addFirst(Integer.toString(a[i]));
            }
        }

        List<String> list = new ArrayList<>();
        while (!dq.isEmpty()) {
            if (n % 2 == 0) {
                list.add(dq.pollFirst());
            } else {
                list.add(dq.pollLast());
            }
        }
        String result = String.join(" ", list);

        // 出力
        System.out.println(result);
    }
}
