import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();
        double arc = ( 5.5 * ( 60.0 * h + m ) ) % 360 * Math.PI / 180;
        double answer = Math.sqrt( a * a + b * b - 2 * a * b * Math.cos(arc) );
        System.out.println(String.format("%.20f", answer));
    }
}