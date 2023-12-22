import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];
        int[] F = new int[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
        for (int i = 0; i < N; i++) {
            F[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(F);
        if (sum <= K) {
            System.out.println(0);
            return;
        }
        long lo = 0;
        long hi = Long.MAX_VALUE / 3;
        while (hi - lo > 1) {
            long mid = (hi + lo) / 2;
            long need = 0;
            for (int i = 0; i < N; i++) {
                if ((long)A[i] * F[N - 1 - i] > mid) {
                    need += A[i] - mid / F[N - 1 - i];
                }
            }
            if (need <= K) {
                hi = mid;
            } else {
                lo = mid;
            }
        }
        System.out.println(hi);
    }
}
