import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] w = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.next();
        }

        // 主処理
        List<String> list = new ArrayList<>();
        list.add(w[0]);
        String next = String.valueOf(w[0].charAt(w[0].length() - 1));
        boolean judge = true;
        for (int i = 1; i < w.length; i++) {
            String head = String.valueOf(w[i].charAt(0));
            if (!next.equals(head) || list.contains(w[i])) {
                judge = false;
                break;
            }
            list.add(w[i]);
            next = String.valueOf(w[i].charAt(w[i].length() - 1));
        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
