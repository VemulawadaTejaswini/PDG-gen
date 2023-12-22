import java.util.BitSet;
import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        String S = sc.next();
        BitSet n = new BitSet(S.length());
        BitSet u = new BitSet(S.length());
        u.set(0);
        for (int i = 1; i < S.length(); i++) {
            boolean eq = S.charAt(i - 1) != S.charAt(i);
            n.set(i, n.get(i - 1) == eq);
            u.set(i, u.get(i - 1) == eq);
        }

        System.out.println(Math.min(n.cardinality(), u.cardinality()));
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}