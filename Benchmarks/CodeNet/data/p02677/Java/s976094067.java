
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static double A = sc.nextDouble();
    static double B = sc.nextDouble();
    static double H = sc.nextDouble();
    static double M = sc.nextDouble();

    public static void main(String[] args) {
        //角度を求める
        double kHour = H * 30;
        if (kHour > 180){
            kHour = kHour - 360;
        }
        double kMin = M * 6;
        if (kMin > 180){
            kMin = kMin - 360;
        }
        double kakudo = Math.abs(kHour - kMin) + M * 0.5;
        double dC = Math.pow(A, 2) + Math.pow(B, 2) - 2 * A * B * Math.cos(Math.toRadians(kakudo));
        double ans = Math.sqrt(dC);

        System.out.print(ans);



    }

}
