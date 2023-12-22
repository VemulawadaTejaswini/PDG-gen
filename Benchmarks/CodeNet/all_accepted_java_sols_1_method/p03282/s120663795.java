import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        String result = "0";

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                index++;
            } else {
                break;
            }
        }

        if (k <= index) {
            result = "1";
        } else {
            result = String.valueOf(s.charAt(index));
        }

        // 出力
        System.out.println(result);
    }
}
