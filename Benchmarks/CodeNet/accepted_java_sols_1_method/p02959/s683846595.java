import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        int[] A = new int[N+1];
        int[] B = new int[N];
        for (int i = 0; i < N + 1; i++) {
            A[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        long sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                if (A[i + j] <= B[i]) {
                    sum += A[i + j];
                    B[i] -= A[i + j];
                    A[i + j] = 0;
                } else {
                    sum += B[i];
                    A[i + j] -= B[i];
                    B[i] = 0;
                }
            }
        }

        out.printf("%d\n", sum);
        out.flush();
    }
}
