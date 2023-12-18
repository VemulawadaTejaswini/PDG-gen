import java.util.*;

public class Main {
    public static final double EPS = 0.001f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();
                int f = sc.nextInt();

                double x = (double)(c*e-b*f)/(a*e-b*d);
                double y = (double)(c*d-f*a)/(b*d-a*e);

                if (x < EPS && x > -EPS) x = 0;
                if (y < EPS && y > -EPS) y = 0;

                System.out.printf("%.3f %.3f\n", x, y); 
            }
        } catch (Exception e) {
        }
    }
}