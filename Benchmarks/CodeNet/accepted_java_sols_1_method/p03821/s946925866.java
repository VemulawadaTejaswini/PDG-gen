import java.util.Scanner;

/**
 * Created by zzt on 17-1-22.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
        }

        long ret = 0;
        for (int i = N - 1; i >= 0; i--) {
            long mod = (A[i] + ret) % B[i];
            if (mod != 0)
                ret += (B[i] - mod);
        }

        System.out.println(ret);
    }
}