import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        doit(args, new Scanner(System.in), System.out);
    }

    static void doit(String[] args, Scanner scanner, PrintStream out) {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();
            
            double a2 = x2 - x1;
            double b2 = y2 - y1;
            double a3 = x3 - x1; 
            double b3 = y3 - y1;
            double det = a2 * b3 - a3 * b2;
            double c2 = a2 * a2 + b2 * b2;
            double c3 = a3 * a3 + b3 * b3;
            double ap = 0.5 * (b3 * c2 - b2 * c3) / det;
            double bp = 0.5 * (a2 * c3 - a3 * c2) / det;

            double xp = ap + x1;
            double yp = bp + y1;
            double r = Math.sqrt(xp * xp + yp * yp);
            out.println(String.format("%.3f %.3f %.3f", round(xp), round(yp), round(r)));
        }
    }

    static BigDecimal round(double d) {
        return new BigDecimal(d).setScale(3, RoundingMode.HALF_UP);
    }
}