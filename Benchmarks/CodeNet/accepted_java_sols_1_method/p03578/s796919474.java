import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            if (d.containsKey(num)) {
                d.put(num, d.get(num) + 1);
            } else {
                d.put(num, 1);
            }
        }
        int m = Integer.parseInt(sc.next());
        Map<Integer, Integer> t = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(sc.next());
            if (t.containsKey(num)) {
                t.put(num, t.get(num) + 1);
            } else {
                t.put(num, 1);
            }
        }
        sc.close();

        // 主処理
        boolean judge = true;
        for (int key : t.keySet()) {
            if (!(d.containsKey(key) && t.get(key) <= d.get(key))) {
                judge = false;
                break;
            }
        }

        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
