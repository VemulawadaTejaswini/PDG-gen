import java.io.*;
import java.util.*;

public class Main {
    static final String YES = "Yes";
    static final String NO = "No";

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();
        long C;
        C = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(A, B, C);
    }
}

class Solver {
    public void solve(long A, long B, long C) {
        if (A == B && B != C) {
            System.out.println("Yes");
            return;
        }
        if (A == C && B != C) {
            System.out.println("Yes");
            return;
        }
        if (B == C && A != C) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}

