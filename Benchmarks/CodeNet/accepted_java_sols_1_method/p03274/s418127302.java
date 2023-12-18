import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int K = sc.nextInt();

        long[] posi = new long[N];
        long[] nega = new long[N];

        int posiSize = 0;
        int negaSize = 0;
        for (int i = 0; i < N; i++) {
            long value = sc.nextLong();
            if (value > 0) {
                posi[posiSize] = value;
                posiSize++;
            } else {
                nega[negaSize] = value;
                negaSize++;
            }
        }

        long min = Long.MAX_VALUE;

        // 全部右
        if (K <= posiSize) {
            min = Math.min(posi[K - 1], min);
        }
        // 全部左
        if (K <= negaSize) {
            min = Math.min(Math.abs(nega[negaSize - K]), min);
        }


        // 右行ってから左.
        for (int i = 1; i <= posiSize; i++) {
            if (i < K) {
                int posiCount = i;
                int negaCount = K - i;
                if (negaCount <= negaSize) {
                    long posiD = (2 * posi[posiCount - 1]);
                    long negaD = Math.abs(nega[negaSize - negaCount]);
                    min = Math.min(posiD + negaD, min);
                }
            }
        }
        // 左行ってから右.
        for (int i = 1; i <= negaSize; i++) {
            if (i < K) {
                int negaCount = i;
                int posiCount = K - i;
                if (posiCount <= posiSize) {
                    long posiD = posi[posiCount - 1];
                    long negaD = 2 * Math.abs(nega[negaSize - negaCount]);
                    min = Math.min(posiD + negaD, min);
                }
            }
        }
        System.out.println(min);
    }
}
