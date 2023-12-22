import java.io.*;
import java.util.*;

public class Main {
    static final String YES = "Yes";
    static final String NO = "No";

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        String S;
        S = sc.next();

        final Solver solver = new Solver();
        System.out.println(solver.solve(N, S) ? YES : NO);
    }
}

class Solver {
    public boolean solve(long N, String S) {
        if (N % 2 != 0) return false;

        String first = S.substring(0, (int) N/2);
        String second = S.substring((int) (N/2));

        return first.equals(second);
    }
}

