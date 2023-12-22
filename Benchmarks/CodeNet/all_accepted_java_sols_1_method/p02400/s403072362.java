import java.lang.Math;
import java.util.Scanner;


public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        double erea = 0;
        double length = 0;
        double r = sc.nextDouble();

        erea = 2 * Math.PI * r;
        length = Math.PI * r * r;

        System.out.printf("%.10f %.10f", length, erea);
    }
}
