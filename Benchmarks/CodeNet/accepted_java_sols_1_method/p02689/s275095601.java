import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] h = new Integer[n];
        Arrays.setAll(h, i -> Integer.parseInt(sc.next()));

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            map.get(a).add(h[b]);
            map.get(b).add(h[a]);
        }
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; i < n; i++) {
            boolean isGood = true;
            for (int height : map.get(i)) {
                if (h[i] <= height) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
