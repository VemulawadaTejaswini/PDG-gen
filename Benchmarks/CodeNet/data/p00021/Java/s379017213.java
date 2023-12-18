import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\\s]+");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double[] x = new double[4];
            double[] y = new double[4];
            for (int j = 0; j < 4; j++) {
                x[j] = sc.nextDouble();
                y[j] = sc.nextDouble();
            }
            boolean b = Math.abs((x[1] - x[0]) * (y[3] - y[2]) - (x[3] - x[2]) * (y[1] - y[0])) < 1e-10;
            System.out.println(b ? "YES" : "NO");
        }
    }
}
