import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();

        final Solver solver = new Solver();
        solver.solve(S);
    }
}

class Solver {
    public void solve(String S) {
        int ans = 0;
        int N = S.length();
        for (int i = 0; i < N / 2; i++) {
            if (S.charAt(i) != S.charAt(N - i - 1)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

