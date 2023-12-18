import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        // 主処理
        double waterH = (double) x / (a * a);

        double result = 0;
        if (b <= waterH * 2) {
            double h = b - waterH;
            result = Math.toDegrees(Math.atan(h / (a / 2.0)));
        } else {
            double bottom = x * 2.0 / a / b;
            result = Math.toDegrees(Math.atan((double) b / bottom));
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
