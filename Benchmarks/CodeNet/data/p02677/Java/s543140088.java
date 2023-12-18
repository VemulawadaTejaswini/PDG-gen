import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();
        int mAngle;
        double hAngle = h * 30 + 0.5 * m;
        if(m == 0)
        {
            mAngle = 360;
        }
        else
        {
            mAngle = (int)m * 6;
        }
        double absAngle = Math.abs(hAngle - (double)mAngle);
        double cos = Math.cos(Math.toRadians(absAngle));
        double ans = (a * a) + (b * b) - (2 * a * b * cos);
        System.out.println(Math.sqrt(ans));
    }
}