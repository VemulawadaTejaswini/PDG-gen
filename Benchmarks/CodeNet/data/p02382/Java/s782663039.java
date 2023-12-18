import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            y[i] = scan.nextInt();
        }

        double D1 = 0;
        double D2 = 0;
        double D3 = 0;
        double D4 = 0;

        for (int i = 0; i < n; i++) {
            D1 += Math.abs(x[i] - y[i]);
            D2 += Math.pow(Math.abs(x[i] - y[i]), 2);
            D3 += Math.pow(Math.abs(x[i] - y[i]), 3);
            if (D4 < Math.abs(x[i] - y[i])) {
                D4 = Math.abs(x[i] - y[i]);
            }
        }

        System.out.printf("%8f\n%8f\n%8f\n%8f\n", D1, Math.sqrt(D2),
                Math.cbrt(D3), D4);
    }
}