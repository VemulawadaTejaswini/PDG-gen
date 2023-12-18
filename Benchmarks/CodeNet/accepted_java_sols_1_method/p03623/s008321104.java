import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int diffA = Math.abs(x - a);
        int diffB = Math.abs(x - b);
        boolean judge = diffA <= diffB;
        String result = judge ? "A" : "B";

        // 出力
        System.out.println(result);
    }
}
