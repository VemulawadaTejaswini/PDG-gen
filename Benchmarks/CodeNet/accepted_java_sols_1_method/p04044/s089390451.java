import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        // 主処理
        Arrays.sort(s);
        String result = String.join("", s);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
