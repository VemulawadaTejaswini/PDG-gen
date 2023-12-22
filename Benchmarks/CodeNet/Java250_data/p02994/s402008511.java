import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long L;
        L = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(N, L);
    }
}

class Solver {
    public void solve(long N, long L) {
        long ans = 0;
        long min = Long.MAX_VALUE;
        long minScore = -1;
        for (int i = 0; i < N; i++) {
            long score = L + i;
            ans += score;

            if (min > Math.abs(score)) {
                min = Math.abs(score);
                minScore = score;
            }
        }
        System.out.println(ans - minScore);
    }
}

