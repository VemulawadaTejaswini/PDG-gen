import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int num = x;
        int result = 1;
        while (num % 360 != 0) {
            num += x;
            result++;
        }

        // 出力
        System.out.println(result);
    }
}
