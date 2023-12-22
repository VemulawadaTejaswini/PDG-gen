import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long mlta = Math.max(a * c, a * d);
        long mltb = Math.max(b * c, b * d);
        long result = Math.max(mlta, mltb);

        // 出力
        System.out.println(result);
    }
}
