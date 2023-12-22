import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextInt();
        double b = scn.nextInt();
        double h = scn.nextInt();
        double m = scn.nextInt();

        double ans = 0;
        double r = Math.abs(((((h * 60) + m) / 2) - (m * 6)));

        if ( r == 0) {
            System.out.println(Math.abs(a - b));
        } else if (r == 180) {
            System.out.println(a + b);
        } else {
            ans = Math.sqrt((a * a) + (b * b) - (2 * a * b * Math.cos(Math.toRadians(r))));
            System.out.println(ans);
        }

        scn.close();
    }
}