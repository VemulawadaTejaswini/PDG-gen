import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 2017/10/20 7:35.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];

            for (int i = 0; i < N; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }

            int[] listX = Arrays.copyOf(x, N);
            int[] listY = Arrays.copyOf(y, N);
            Arrays.sort(listX);
            Arrays.sort(listY);

            long ans = Long.MAX_VALUE;

            for (int yi = 0; yi < N; yi++) {
                int yFrom = listY[yi];
                for (int yj = yi; yj < N; yj++) {
                    int yTo = listY[yj];
                    int xi = 0;
                    int xj = 0;

                    while (xj < N) {
                        int xFrom = listX[xi];
                        int xTo = listX[xj];
                        int cnt = 0;
                        for (int i = 0; i < N; i++) {
                            if (xFrom <= x[i] && x[i] <= xTo && yFrom <= y[i] && y[i] <= yTo) {
                                cnt++;
                            }
                        }
                        if (cnt >= K) {
                            ans = Math.min(ans, (long) (xTo - xFrom) * (yTo - yFrom));
                            xi++;
                            xj = Math.max(xj, xi);
                        } else {
                            xj++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}