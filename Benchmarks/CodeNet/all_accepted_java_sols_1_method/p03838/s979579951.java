import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        // 主処理
        int result = 0;
        int diff = Math.abs(Math.abs(x) - Math.abs(y));

        if (diff == 0 && x != y) {
            result++;

        } else if (x < y) {
            if (x < 0 && 0 < y) {
                result++;
            }
            result += diff;

        } else if (y < x) {
            if (x < 0 || 0 < y) {
                result += 2;
            } else {
                result++;
            }
            result += diff;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
