import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result;
        if (x <= 599) {
            result = 8;
        } else if (x <= 799) {
            result = 7;
        } else if (x <= 999) {
            result = 6;
        } else if (x <= 1199) {
            result = 5;
        } else if (x <= 1399) {
            result = 4;
        } else if (x <= 1599) {
            result = 3;
        } else if (x <= 1799) {
            result = 2;
        } else {
            result = 1;
        }

        // 出力
        System.out.println(result);
    }
}
