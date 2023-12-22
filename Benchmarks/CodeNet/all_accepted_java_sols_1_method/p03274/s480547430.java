import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] candles = new int[N];
        for (int i = 0; i < N; i++) {
            candles[i] = sc.nextInt();
        }

        int numWindows = N - K + 1;

        int minDist = -1;
        for (int i = 0; i < numWindows; i++) {
            int min = candles[i];
            int max = candles[i + K - 1];

            int dist = -1;
            if ((min < 0) && (max < 0)) {
                dist = -min;
            } else if ((min >= 0) && (max >= 0)) {
                dist = max;
            } else {
                if (max > -min) {
                    dist = max - min * 2;
                } else {
                    dist = max * 2 - min;
                }
            }

            if ((minDist == -1) || (dist < minDist)) {
                minDist = dist;
            }

        }

        System.out.println(minDist);
    }
}