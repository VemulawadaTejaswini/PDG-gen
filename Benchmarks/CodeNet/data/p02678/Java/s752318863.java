import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        int[] route = new int[N - 1];
        boolean[] b;
        boolean bb = true;
        for (int i = 0; i < M; i++) {
            A[i] = s.nextInt();
            B[i] = s.nextInt();
        }
        for (int i = 2; i < N + 1; i++) {
            b = new boolean[M];
            int ii = i;
            int j = 0;
            while (j < M) {
                if (b[j]) {
                    j++;
                    continue;
                }
                if (ii == A[j]) {
                    ii = B[j];
                    b[j] = true;
                    j = 0;
                    route[i - 2]++;
                } else if (ii == B[j]) {
                    ii = A[j];
                    b[j] = true;
                    j = 0;
                    route[i - 2]++;
                } else {
                    j++;
                }
                if (ii == 1) break;
            }
            if (ii != 1) {
                System.out.print("No");
                bb = false;
                break;
            }
        }
        if (bb) {
            System.out.println("Yes");
            for (int i = 2; i < N; i++) System.out.println(route[i - 2]);
            System.out.print(route[N - 2]);
        }
    }
}