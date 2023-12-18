import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        sc.close();

        // 主処理
        long result = (long) Math.floor(a * b);

        // 出力
        System.out.println(result);
    }
}
