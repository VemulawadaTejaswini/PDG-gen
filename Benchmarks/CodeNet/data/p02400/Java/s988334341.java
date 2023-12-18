import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main{
public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double r  = scan.nextDouble();
        System.out.println(calCircleArea(r) + " " + calCircumference(r));
    }
    private static double calCircleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
    private static double calCircumference(double r) {
        return 2 * Math.PI * r;
    }
}
