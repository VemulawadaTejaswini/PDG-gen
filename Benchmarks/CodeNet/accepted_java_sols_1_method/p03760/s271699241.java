import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String o = sc.next();
        String e = sc.next();
        sc.close();

        // 主処理
        String result = "";
        for (int i = 0; i < o.length(); i++) {
            result += o.charAt(i);
            if (i == o.length() - 1 && e.length() != o.length()) {
                break;
            }
            result += e.charAt(i);
        }

        // 出力
        System.out.println(result);
    }
}
