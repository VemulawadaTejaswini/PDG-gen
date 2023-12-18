
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double a = Integer.parseInt(sc.next());
            double b = Integer.parseInt(sc.next());
            double c = Integer.parseInt(sc.next());
            double d = Integer.parseInt(sc.next());
            double e = Integer.parseInt(sc.next());
            double f = Integer.parseInt(sc.next());

            double x = (c*e - b*f) / (a*e - b*d);
            double y = (c - a*x) / b;

            if (x == 0.0) {
                x = 0.0;
            }
            if (y == 0.0) {
                y = 0.0;
            }

            System.out.printf("%4.3f %4.3f\n", x, y);
        }
    }
}