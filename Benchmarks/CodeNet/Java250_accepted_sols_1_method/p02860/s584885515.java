import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        // 主処理
        boolean judge = false;
        if (n % 2 == 0) {
            String head = s.substring(0, s.length() / 2);
            String foot = s.substring(s.length() / 2, s.length());
            judge = head.equals(foot);
        }

        String result = judge ? "Yes" : "No";
        // 出力
        System.out.println(result);
        sc.close();
    }
}
