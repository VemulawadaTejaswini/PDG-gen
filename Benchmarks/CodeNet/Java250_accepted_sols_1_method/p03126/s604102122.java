import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] k = new int[n];
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            k[i] = Integer.parseInt(sc.next());
            int[] a = new int[k[i]];
            for (int j = 0; j < k[i]; j++) {
                a[j] = Integer.parseInt(sc.next());
            }
            list.add(a);
        }

        // 主処理
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int[] target = list.get(i);
            for (int j = 0; j < k[i]; j++) {
                if (map.containsKey(target[j])) {
                    map.put(target[j], map.get(target[j]) + 1);
                } else {
                    map.put(target[j], 1);
                }
            }
        }

        int result = 0;
        for (int i = 1; i <= m; i++) {
            if (map.containsKey(i) && map.get(i) == n) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}