import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long H;
        H = sc.nextLong();
        long A;
        A = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(H, A);
    }
}

class Solver {
    public void solve(long H, long A) {
        long left = H;
        long ans = 0;
        while (left > 0) {
            ans++;
            left -= A;
        }

        System.out.println(ans);
    }
}

