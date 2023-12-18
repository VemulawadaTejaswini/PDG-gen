import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        while (scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d = scanner.nextDouble();
            double e = scanner.nextDouble();
            double f = scanner.nextDouble();
            double x = 0;
            double y = 0;

            x = (c*e - b*f) / (a*e - b*d);
            y = (c*d - a*f) / (b*d - a*e);
            if (x == -0) {
                x = 0;
            }
            if (y == -0) {
                y = 0;
            }
            
            System.out.printf("%.3f %.3f\n", x, y);

        }
    }
}