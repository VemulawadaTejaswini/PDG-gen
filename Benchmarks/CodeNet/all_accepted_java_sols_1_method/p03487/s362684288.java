import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        sc.close();

        // 主処理
        int result = 0;
        for (int key : map.keySet()) {
            int count = map.get(key);
            int num = 0;
            if (key <= count) {
                num = count - key;
            } else {
                num = count;
            }
            result += num;
        }

        // 出力
        System.out.println(result);
    }
}
