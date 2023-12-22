import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        // 主処理
        int lenA = a.length();
        while (lenA < 100) {
            a = "0" + a;
            lenA = a.length();
        }
        int lenB = b.length();
        while (lenB < 100) {
            b = "0" + b;
            lenB = b.length();
        }

        int compare = a.compareTo(b);
        String result = "EQUAL";
        if (0 < compare) {
            result = "GREATER";
        } else if (compare < 0) {
            result = "LESS";
        }

        // 出力
        System.out.println(result);
    }
}
