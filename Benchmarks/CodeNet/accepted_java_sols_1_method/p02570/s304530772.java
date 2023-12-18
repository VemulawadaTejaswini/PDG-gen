import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int time = (int) Math.ceil((double) d / s);
        boolean judge = time <= t;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
