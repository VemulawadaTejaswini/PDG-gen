
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double d = scan.nextDouble();
            double e = scan.nextDouble();
            double f = scan.nextDouble();
            double db;
            double ae;
            double x;
            double y;
            double j;
            double g;
            db = d * b;
            ae = a * e;
                                       j = db - ae;
　　　　　　　　　　　　　            y = ((d * c) - (a * f)) / j;

            g = y * b;

            x = (-1 * (g) + c) / a;

            System.out.printf("%.3f %.3f\n", x, y);

        }
    }
}

