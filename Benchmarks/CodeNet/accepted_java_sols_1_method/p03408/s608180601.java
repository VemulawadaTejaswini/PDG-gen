import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<String, Integer> s = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (!s.containsKey(str)) {
                s.put(str, 1);
            } else {
                s.put(str, s.get(str) + 1);
            }
        }
        int m = Integer.parseInt(sc.next());
        Map<String, Integer> t = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String str = sc.next();
            if (!t.containsKey(str)) {
                t.put(str, 1);
            } else {
                t.put(str, t.get(str) + 1);
            }
        }

        // 主処理
        int result = 0;
        for (String key : s.keySet()) {
            int sum = s.get(key);
            if (t.containsKey(key)) {
                sum -= t.get(key);
            }
            result = Math.max(result, sum);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
