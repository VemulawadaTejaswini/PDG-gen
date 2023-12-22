import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N + 1];
        int[] B = new int[N];

        for (int i = 0; i < N + 1; i++) A[i] = sc.nextInt();
        for (int i = 0; i < N; i++) B[i] = sc.nextInt();
        int[] AC = A.clone();
        long cnt = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] >= B[i]) {
                A[i] -= B[i];
                B[i] = 0;
            } else {
                B[i] -= A[i];
                A[i] = 0;
            }

            if (A[i + 1] >= B[i]) {
                A[i + 1] -= B[i];
                B[i] = 0;
            } else {
                B[i] -= A[i + 1];
                A[i + 1] = 0;
            }
        }

        for (int i = 0; i < N + 1; i++) {
            cnt += AC[i] - A[i];
        }

        System.out.println(cnt);
    }
}
