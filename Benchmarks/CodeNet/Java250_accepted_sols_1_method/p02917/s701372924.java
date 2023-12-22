import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = 100001;
        }
        int[] B = new int[N-1];
        for (int i = 0; i < N - 1; i++) {
            B[i] = Integer.parseInt(sc.next());
            if (B[i] < A[i]) {
                A[i] = B[i];
            }
            if (B[i] < A[i+1]) {
                A[i+1] = B[i];
            }
        }
        sc.close();

        out.printf("%d\n", Arrays.stream(A).sum());
        out.flush();
    }
}
