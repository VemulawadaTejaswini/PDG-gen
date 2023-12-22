import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double hourLen = sc.nextDouble();
        double minLen = sc.nextDouble();
        double hour = sc.nextDouble();
        double min = sc.nextDouble();

        double hRad = 2 * Math.PI * (hour / 12.0 + min / 60.0 / 12.0);
        double mRad = 2 * Math.PI * min / 60.0;

        double theta = hRad - mRad;

        double ans = Math.pow(hourLen, 2) + Math.pow(minLen, 2) - 2.0 * hourLen * minLen * Math.cos(theta);

        System.out.println(Math.sqrt(ans));

    }
}
