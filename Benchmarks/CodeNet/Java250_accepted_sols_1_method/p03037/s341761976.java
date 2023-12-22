import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] L = new int[M];
        int[] R = new int[M];
        for (int i = 0; i < M; i++) {
            L[i] = Integer.parseInt(sc.next());
            R[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int Lmax = 0;
        int Rmin = Integer.MAX_VALUE;
        for (int i = 0; i < M; i++) {
            if (Lmax < L[i]) {
                Lmax = L[i];
            }
            if (R[i] < Rmin) {
                Rmin = R[i];
            }
        }
        out.printf("%d\n", Math.max(0, Rmin - Lmax + 1));
        out.flush();
    }
}
