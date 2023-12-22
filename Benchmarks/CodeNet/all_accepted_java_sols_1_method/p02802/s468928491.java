import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); // 問題数
        int m = Integer.parseInt(sc.next()); // 提出回数
        // 正答HashSet(key:正答した問題番号)
        HashSet<Integer> ac = new HashSet<>(n);
        // 誤答HashMap(key:誤答した問題番号、value:誤答回数)
        HashMap<Integer, Integer> wa = new HashMap<>(n);
        // 正答数：'AC'を1回以上出した問題の数
        int ac_count = 0;
        // ペナルティ数：正答済みの各問題において、初めて'AC'を出すまでに出した'WA'の数の総和
        int wa_count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0, p = 0, num = 0; i < m; i++) {
            p = Integer.parseInt(sc.next()); // 提出した問題番号
            // String s = sc.next(); // 結果
            sb.setLength(0);
            sb.append(sc.next());
            // 正答済みの問題番号はスキップ
            if (ac.contains(p)) {
                continue;
            }
            // 結果がACの場合
            if (sb.toString().equals("AC")) {
                ac_count++; // 正答数を加算
                ac.add(p); // 問題番号を正答HashSetに格納
                continue;
            }
            // 上記以外はWAとして扱う
            // 誤答HashMapに格納済みの問題番号の場合、誤答数を加算
            if (wa.containsKey(p)) {
                num = wa.get(p);
                num++;
                wa.replace(p, num);
            } else {
                wa.put(p, 1); // 初誤答した場合、誤答HashMapへ登録
            }
        }
        // 正答した問題番号の誤答数のみペナルティ数として扱う
        for (Integer i : wa.keySet()) {
            if (ac.contains(i)) {
                wa_count += wa.get(i);
            }
        }
        System.out.println(String.format("%s %s", ac_count, wa_count));
        sc.close();
    }
}
