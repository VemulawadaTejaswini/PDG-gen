import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double H = sc.nextDouble();
        double M = sc.nextDouble();
        sc.close();

        // 一分ごとの分針の角度の増減値を求める
        double perMinRad = 360.0000 / 60.0000;

        // 一時間ごとの時針の角度の増減値を求める
        double perHourRad = 360.0000 / (12.0000 * 60.0000);

        // 分針の角度
        double minRad = perMinRad * M;

        // 時針の角度
        double hourRad = (H * 60 * perHourRad) + (M * perHourRad);

        double rad = hourRad - minRad;

        if (rad > 180) {
            rad = 360.0000 - rad;
        }

        if (rad == 180.0) {
            System.out.println(A + B);
        } else {
            rad = Math.toRadians(rad);
            double cosRad = Math.cos(rad);
            double res = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - (2 * A * B * cosRad));
            System.out.println(res);
        }
    }
}
