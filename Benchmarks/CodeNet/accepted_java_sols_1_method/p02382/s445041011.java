import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < n; i++) {
            y[i] = Integer.parseInt(sc.next());
        }

        // p = 1
        double D = 0.0;
        for (int i = 0; i < n; i++) {
            D += Math.abs(x[i] - y[i]);
        }
        out.printf("%.10f\n", D);

        // p = 2
        D = 0.0;
        for (int i = 0; i < n; i++) {
            D += Math.pow(x[i] - y[i], 2);
        }
        out.printf("%.10f\n", Math.sqrt(D));

        // p = 3
        D = 0.0;
        for (int i = 0; i < n; i++) {
            D += Math.pow(Math.abs(x[i] - y[i]), 3);
        }
        out.printf("%.10f\n", Math.cbrt(D));

        // p = unlimited
        D = 0.0;
        for (int i = 0; i < n; i++) {
            double temp = D;
            D = Math.max(Math.abs(x[i] - y[i]), temp);
        }
        out.printf("%.10f\n", D);
        out.flush();
    }
}
