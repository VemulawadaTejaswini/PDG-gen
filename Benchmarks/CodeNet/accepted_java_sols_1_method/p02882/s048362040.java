import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double A = sc.nextInt();
        double B = sc.nextInt();
        double X = sc.nextInt();
        double s = X / A;
        double ans;
        if (s * 2 < A * B) {
            double h = s * 2 / B;
            ans = Math.PI / 2 - Math.atan2(h, B);
        } else {
            double h = (A * B - s) * 2 / A;
            ans = Math.atan2(h, A);
        }
        System.out.printf("%.9f\n", ans * 180 / Math.PI);
    }
}
