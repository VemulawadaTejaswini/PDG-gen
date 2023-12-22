import java.io.*;
import java.rmi.MarshalledObject;
import java.util.*;

public class Main {
    static final long MOD = 1000000007;

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();
        Set<Long> a = new HashSet<>();
        for(int i = 0 ; i < M ; i++){
            a.add(sc.nextLong());
        }

        final Solver solver = new Solver();
        System.out.println(solver.solve(N, a));
    }
}

class Solver {
    final Map<Long, Long> memo = new HashMap<>();

    public long solve(long N, Set<Long> a) {
        return count(0, N, a);
    }

    private long count(long start, long end, Set<Long> a) {
        if (memo.containsKey(start)) {
            return memo.get(start) % Main.MOD;
        }

        if (a.contains(start) || start > end) {
            return 0;
        }
        if (start == end) {
            return 1;
        }

        final long S1 = count(start + 1, end, a) % Main.MOD;
        memo.put(start + 1, S1);

        final long S2 = count(start + 2, end, a) % Main.MOD;
        memo.put(start + 2, S2);

        return (S1 + S2) % Main.MOD;
    }


}

