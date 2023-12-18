import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());

        // 主処理
        int div = x / 100;
        int remain = x % 100;
        int result = remain <= 5 * div ? 1 : 0;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
