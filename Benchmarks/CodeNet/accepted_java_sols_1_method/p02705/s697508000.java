import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        double result = 2 * r * Math.PI;

        // 出力
        System.out.println(result);
    }
}
