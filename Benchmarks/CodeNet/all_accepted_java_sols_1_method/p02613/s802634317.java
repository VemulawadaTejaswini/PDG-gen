import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] judgeResult = new String[] { "AC", "WA", "TLE", "RE" };
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(judgeResult[i], 0);
        }
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            map.put(s, map.get(s) + 1);
        }
        sc.close();

        // 主処理
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(judgeResult[i] + " x " + map.get(judgeResult[i]));
        }
        String result = String.join("\r\n", list);

        // 出力
        System.out.println(result);
    }
}
