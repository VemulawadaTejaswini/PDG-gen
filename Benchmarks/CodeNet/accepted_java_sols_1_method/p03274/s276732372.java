import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K == 1) {
            System.out.println(Math.abs(sc.nextInt()));
            return;
        }

        int[] candles = new int[N];

        for (int i = 0; i < N; i++) {
            candles[i] = sc.nextInt();
        }

        int xl = Integer.MIN_VALUE;
        int xr = Integer.MAX_VALUE;

        int tmp = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N - K + 1; i++) {
            xl = candles[i];
            xr = candles[i+K-1];

            if (xl >= 0) {
                tmp = xr;
            } else if (xr <= 0) {
                tmp = Math.abs(xl);
            } else {
                tmp = Math.abs(xl) + xr + Math.min(Math.abs(xl), xr);
            }
            min = Math.min(min, tmp);
        }

        System.out.println(min);

    }
}
