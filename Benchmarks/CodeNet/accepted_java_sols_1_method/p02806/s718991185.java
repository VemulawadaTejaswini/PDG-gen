import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<String> s = new ArrayList<>();
        Integer[] t = new Integer[n];
        for (int i = 0; i < n; i++) {
            s.add(sc.next());
            t[i] = Integer.parseInt(sc.next());
        }
        String x = sc.next();
        sc.close();

        // 主処理
        int index = s.indexOf(x);
        int result = 0;
        for (int i = index + 1; i < t.length; i++) {
            result += t[i];
        }

        // 出力
        System.out.println(result);
    }
}
