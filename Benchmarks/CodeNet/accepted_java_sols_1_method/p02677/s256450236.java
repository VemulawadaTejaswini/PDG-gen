import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        // 針の角度
        double hour = (h % 12 * 30) + (m * 0.5);
        double minute = m * 6;
        double kakudo = Math.max(hour, minute) - Math.min(hour, minute);
        if (180 < kakudo) {
            kakudo = 360 - kakudo;
        }

        // 辺の長さ
        double numA = Math.pow(a, 2);
        double numB = Math.pow(b, 2);
        double numC = 2 * a * b * Math.cos(Math.toRadians(kakudo));
        double result = Math.sqrt(numA + numB - numC);

        // 出力
        System.out.println(result);
    }
}
