import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long X;
        X = sc.nextLong();
        long[] L = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                L[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, X, L);
    }
}

class Solver {
    public void solve(long N, long X, long[] L) {
        if (X == 0) {
            System.out.println(0);
            return;
        }

        long D = 0;
        for (int i = 0; i < N; i++) {
            D += L[i];
            if (D > X) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println(N+1);
    }
}

