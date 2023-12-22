
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];


        for (int i = 0 ; i < N ; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        double[][] dist = new double[N][N];
        double totalDist = 0.0;
        for (int i = 0 ; i < N ; i++) {
            for (int j = i + 1 ; j < N ; j++) {
                dist[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
                totalDist += dist[i][j];
            }
        }

        System.out.println(totalDist * 2.0 / N);
    }
}
