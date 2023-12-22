import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double angle = (h * 30 + m * 0.5) - (m * 6);
        if (angle > 180) {
            angle = 360 - angle;
        }
        double ans = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(angle)));
        System.out.println(ans);
    }
}