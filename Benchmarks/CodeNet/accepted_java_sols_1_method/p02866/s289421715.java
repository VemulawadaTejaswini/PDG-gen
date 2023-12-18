import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean impossible = false;

        Map<Integer, Integer> map = new HashMap<>();

        int first = sc.nextInt();
        map.put(first, 1);
        if (first != 0) {
            impossible = true;
        }

        for (int i = 1; i < n; i++) {
            int tmp = sc.nextInt();
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            } else {
                map.put(tmp, 1);
            }
        }
        // for debug
        // System.out.println(map);

        // 0が 0 or 複数個はNG
        if (!impossible && map.get(0) != 1) {
            impossible = true;
        }

        // keyが0からの連続数でない場合はNG
        TreeSet<Integer> tree = new TreeSet<>(map.keySet());
        if (tree.size() - 1 != tree.last()) {
            impossible = true;
        }
        // for debug
        // System.out.println(tree);

        long ans = 1;
        if (impossible) {
            ans = 0;
        } else {
            for (int i = 2; i <= tree.last(); i++) {
                for (int j = 0; j < map.get(i); j++) {
                    ans *= map.get(i - 1);
                    ans %= 998244353;
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }

}
