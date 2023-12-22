import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        // 主処理
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String head = s.substring(i, s.length());
            String foot = s.substring(0, i);
            String word = head + foot;
            list.add(word);
        }
        boolean judge = list.contains(t);
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
