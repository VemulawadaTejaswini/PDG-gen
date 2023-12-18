import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[n];
        for (int i = 0; i < n; ++i) {
            A[i] = sc.nextLong();
        }

        long res = 0L;
        for (int i = 0; i < n; ++i) {
            res += A[i] / 2;
            A[i] %= 2L;

            if (A[i] > 0 && i + 1 < n && A[i + 1] > 0) {
                A[i + 1]--;
                A[i]--;
                res++;
            }
        }

        System.out.println(res);
    }
}
