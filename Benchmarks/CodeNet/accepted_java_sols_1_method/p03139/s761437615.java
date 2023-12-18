import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int max = Math.min(a, b);
        int min = Math.max(0, a + b - n);
        String result = max + " " + min;

        // 出力
        System.out.println(result);
    }
}
