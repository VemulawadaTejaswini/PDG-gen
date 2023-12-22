import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        final Solver solver = new Solver();
        solver.solve(A, B);
    }
}

class Solver {
    public void solve(int A, int B) {
        System.out.println(6 - A - B);
    }
}

