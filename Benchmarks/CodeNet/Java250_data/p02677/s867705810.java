import java.util.Scanner;

public class Main {
    // １分間に長針が動く角度
    private static double LONG_ANGLE  = 0.5;
    // １分間に短針が動く角度
    private static double SHORT_ANGLE = 6.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 長針の長さ
        int a = sc.nextInt();
        // 短針の長さ
        int b = sc.nextInt();

        int h = sc.nextInt();
        int m = sc.nextInt();

        double angleH = LONG_ANGLE  * (h * 60 + m);
        double angleM = SHORT_ANGLE * m;
        double angle = 0;
        if (angleH > angleM) {
            angle = angleH - angleM;
        } else {
            angle = angleM - angleH;
        }

        System.out.println(
                Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(angle))));
    }
}