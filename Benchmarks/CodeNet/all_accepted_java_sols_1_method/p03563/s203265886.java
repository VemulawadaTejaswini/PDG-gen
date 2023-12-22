import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int diff = g - r;
        int result = r + diff * 2;

        // 出力
        System.out.println(result);
    }
}
