import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble(), b = scan.nextDouble(), C = scan.nextDouble();
        double rad,s, l, h;

        rad = C * Math.PI / 180 ;

        s = a * b * Math.sin(rad) / 2 ;
        l = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(rad));
        h = 2 * s / a ;

        System.out.printf("%8f\n%8f\n%8f",s, l, h);
    }
}