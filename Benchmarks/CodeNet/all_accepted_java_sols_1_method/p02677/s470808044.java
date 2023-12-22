import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static double A = sc.nextDouble();
    static double B = sc.nextDouble();
    static double H = sc.nextDouble();
    static double M = sc.nextDouble();

    public static void main(String[] args) {
        //角度を求める
        double kHour = (H + (M / 60)) * 30;
        double kMin = M * 6;
        double kakudo = Math.abs(kHour - kMin);
        double dC = Math.pow(A, 2) + Math.pow(B, 2) - 2 * A * B * Math.cos(Math.toRadians(kakudo));
        BigDecimal x = new BigDecimal(Math.sqrt(dC));
        MathContext mc = new MathContext(50, RoundingMode.UP);
        BigDecimal result = x.round(mc);
        System.out.print(result);



    }

}