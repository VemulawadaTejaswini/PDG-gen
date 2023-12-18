import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        float[] x = new float[N];
        float[] y = new float[N];

        for (int i = 0; i < N; i++) {
            x[i] = s.nextInt();
            y[i] = s.nextInt();
        }

        double[][] z = new double[N][N];

        int count = 1;
        for (int i = 1; i < N +1; i++) {
            count *= i;
        }

        double sum = 0;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                z[i][j] = Math.sqrt((x[i] - x[j])*(x[i] - x[j]) + (y[i] - y[j])*(y[i] - y[j]));
                sum += z[i][j];
            }
        }

        System.out.println(sum*2/N);
        s.close();

    }
}