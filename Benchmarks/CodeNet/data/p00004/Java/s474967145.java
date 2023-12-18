import java.io.PrintStream;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        doit(args, new Scanner(System.in), System.out);
    }

    static void doit(String[] args, Scanner scanner, PrintStream out) {
        while (scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d = scanner.nextDouble();
            double e = scanner.nextDouble();
            double f = scanner.nextDouble();
            double x = (c * e - b * f) / (a * e - b * d);
            double y = (c * d - a * f) / (b * d - a * e);
            out.println(String.format("%.3f %.3f", x, y));
        }
    }
}