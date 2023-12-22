import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        // 主処理
        int num = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        boolean judge = (int) Math.sqrt(num) * (int) Math.sqrt(num) == num;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
