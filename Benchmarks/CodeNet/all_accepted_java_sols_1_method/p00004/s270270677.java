import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextDouble()) {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double d = sc.nextDouble();
                double e = sc.nextDouble();
                double f = sc.nextDouble();
                double x;
                double y;
                y = (a*f-c*d)/(a*e-b*d);
                x = (c-b*y)/a;
                System.out.printf("%.3f %.3f\n",x,y);
            }
        }
    }
}
