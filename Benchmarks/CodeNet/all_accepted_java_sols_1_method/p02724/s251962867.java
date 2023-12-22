import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());

        // 主処理
        int uresi1 = x / 500;
        x = x % 500;
        int uresi2 = x / 5;
        int result = 1000 * uresi1 + 5 * uresi2;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
