
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        //半分以下の場合
        if (x / (a * a) <= b / 2) {
            double y = 2 * x / (a * b);
            double r = Math.atan(b / y);
            double ans = Math.toDegrees(r);
            System.out.println(ans);
        } else {
            double y = 2 * x / (a * a) - b;
            double r = Math.atan((b - y) / a);
            double ans = Math.toDegrees(r);
            System.out.println(ans);
        }



       


    }

}
