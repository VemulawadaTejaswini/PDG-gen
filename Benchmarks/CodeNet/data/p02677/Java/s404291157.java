import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double hourLen = sc.nextDouble();
        double minLen = sc.nextDouble();
        double hour = sc.nextDouble();
        double min = sc.nextDouble();

        double hRad = Math.PI * hour / 6.0;
        double mRad = Math.PI * min / 30.0;

        double theta = 0.0;

        /*if (hRad < mRad) {
            theta = mRad - hRad;
        } else if (hRad > mRad) {
            theta = hRad - mRad;
        } else {
            System.out.println(Math.abs(hourLen - minLen));
            return;
        }*/

        if (hRad == mRad) {
            System.out.println(Math.abs(hourLen - minLen));
            return;
        } else {
            theta = Math.abs(mRad - hRad);
        }

        double ans = Math.pow(hourLen, 2) + Math.pow(minLen, 2) - 2.0 * hourLen * minLen * Math.abs(Math.cos(theta));

        System.out.println(Math.sqrt(ans));
    }
}
