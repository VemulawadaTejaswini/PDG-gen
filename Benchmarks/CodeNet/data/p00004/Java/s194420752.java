
import java.util.Scanner;

class Main {

    static double hoge(double x) {
        if (-0.0004 < x && x < 0.0004) {
            return 0.0;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double d = scan.nextDouble();
            double e = scan.nextDouble();
            double f = scan.nextDouble();

            double x = hoge(((e * c) - (b * f)) / ((e * a) - (b * d)));

            System.out.printf("%.3f", x);
            System.out.print(" ");

            double y = hoge(((d * c) - (a * f)) / ((d * b) - (a * e)));

            System.out.printf("%.3f", y);
            System.out.println("");
        }
    }
}

