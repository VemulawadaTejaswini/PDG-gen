import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] a = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                a[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, a);
    }
}

class Solver {
    public void solve(long N, long[] a) {
        int current = 1;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (current != a[i]) {
                ans++;
            }
            else {
                current++;
            }
        }
        if (N == ans) {
            System.out.println(-1);
        }
        else {
            System.out.println(ans);
        }
    }
}

