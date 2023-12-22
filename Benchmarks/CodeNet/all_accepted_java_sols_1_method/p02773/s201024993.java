import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        int v;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                v = map.get(s);
                map.put(s, v + 1);
            }
        }

        // 処理
        // 値の最大値を求める
        int max = 0;
        Iterator<Integer> vals = map.values().iterator();
        while (vals.hasNext()) {
            int val = vals.next();
            if (val > max) {
                max = val;
            }
        }
        // 値が最大値のものを出力する
        List<String> list = new ArrayList();
        Iterator<Map.Entry<String, Integer>> imap = map.entrySet().iterator();
        while (imap.hasNext()) {
            Map.Entry<String, Integer> entry = imap.next();
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        for (String e : list) {
            System.out.println(e);
        }

        // 出力
        // System.out.println(map);
    }

}