import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        // 主処理
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                result++;
            }
            if (a.charAt(i) != c.charAt(i) && b.charAt(i) != c.charAt(i)) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
