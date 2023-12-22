import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int[][] X = new int[N][D];
        double d = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                X[i][j] = Integer.parseInt(sc.next());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N - 1; j++) {
                for (int k = 0; k < D; k++) {
                    d += Math.abs(X[j + 1][k] - X[i][k]) * Math.abs(X[j + 1][k] - X[i][k]);
                }
                d = Math.sqrt(d);
                if (d == (int) d) {
                    count++;
                }
                d = 0;
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        sc.close();
        out.flush();
    }
}