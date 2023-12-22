import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer.parseInt(sc.next()); // 未使用となる変数l
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
