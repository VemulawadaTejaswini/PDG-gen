import java.util.Scanner;
import java.math.*;
class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();

        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;

        String areastr = String.format("%.6f", area);
        String circumferencestr = String.format("%.6f", circumference);

        System.out.println(areastr + " " + circumferencestr);

    }
}