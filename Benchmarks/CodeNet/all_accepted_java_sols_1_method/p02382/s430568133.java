import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            double[] x = new double[n];

            for(int i = 0; i < n; i++) {
                x[i] = scn.nextDouble();
            }

            double p0 = 0, p1 = 0, p2 = 0, p3 = 0;
            for(int i = 0; i < n; i++) {
                double y = scn.nextDouble();
                double z = Math.abs(x[i] - y);
                p0 = p0 > z ? p0 : z;
                p1 += z;
                p2 += Math.pow(z, 2);
                p3 += Math.pow(z, 3);
            }

            System.out.println(p1);
            System.out.println(Math.sqrt(p2));
            System.out.println(Math.cbrt(p3));
            System.out.println(p0);
        }
    }
}