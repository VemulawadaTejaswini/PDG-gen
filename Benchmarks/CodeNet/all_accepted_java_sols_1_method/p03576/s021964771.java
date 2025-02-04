import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {

            int N = in.nextInt();
            int K = in.nextInt();

            long[] x = new long[N];
            long[] y = new long[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            long area = Long.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                for (int i2 = 0; i2 < N; i2++) {
                    for (int j = 0; j < N; j++) {
                        for (int j2 = 0; j2 < N; j2++) {

                            int count = 0;
                            for (int k = 0; k < N; k++) {
                                if (x[k] < x[i] || x[k] > x[i2] || y[k] < y[j] || y[k] > y[j2]) {
                                    continue;
                                }
                                count++;
                            }
                            if (count >= K) {
                                area = Math.min(area, (x[i2] - x[i]) * (y[j2] - y[j]));
                            }
                        }
                    }
                }
            }

            System.out.println(area);
        }
    }

}
