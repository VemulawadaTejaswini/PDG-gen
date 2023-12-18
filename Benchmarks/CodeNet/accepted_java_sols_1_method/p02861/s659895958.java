import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] xs = new double[N];
        double[] ys = new double[N];
        double l = 0;
        for (int i = 0; i < N; i++) {
            xs[i] = sc.nextInt();
            ys[i] = sc.nextInt();
//            double xy = Math.sqrt((x - preX) * (x - preX) + (y - preY) * (y - preY));
        }
        double NN = 1;
        for (double i = 1; i < N + 1; i++) {
            NN *= i;
        }
        double c = NN/N;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                double tmp = Math.sqrt((xs[i] - xs[j]) * (xs[i] - xs[j])
                        + (ys[i] - ys[j]) * (ys[i] - ys[j]));
                l += tmp * c;
            }
        }

        System.out.println(l / NN);
    }
}