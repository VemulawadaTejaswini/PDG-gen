import java.util.*;

public class Main {
    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt(), K = in.nextInt();
        String cs = in.next();
        // System.out.printf("N = %d, K = %d\n", N, K);
        // System.out.printf("cs = %s\n", cs);

        // count number of blocks of 0
        int numBlock0 = 0;
        ArrayList<Integer> ls = new ArrayList<>(), rs = new ArrayList<>();
        ls.add(-1); // dummy
        rs.add(-1); // dummy
        for (int i = 0; i < N; i++) {
            // skip '1's
            for (; i < N && cs.charAt(i) == '1'; i++) {
                ;
            }
            if (i == N) {
                break;
            }
            // cs[i] == '0' at this point
            ls.add(i);
            // skip '0's
            for (; i < N && cs.charAt(i) == '0'; i++) {
                ;
            }
            rs.add(i - 1);
            numBlock0++;
            // i == N or cs[i] == '1' at this point
        }
        ls.add(N); // dummy
        rs.add(N); // dummy
        // System.out.printf("numBlock0 = %d\n", numBlock0);
        // System.out.printf("ls = %s\n", ls);
        // System.out.printf("rs = %s\n", rs);

        // solve
        if (numBlock0 <= K) {
            System.out.printf("%d\n", N);
        } else {
            int ans = 0;
            for (int i = 1; i + K < ls.size(); i++) {
                final int l = rs.get(i - 1) + 1, r = ls.get(i + K) - 1;
                // System.out.printf("i = %d, l = %d, r = %d, num = %d\n", i, l, r, r - l + 1);
                ans = Math.max(ans, r - l + 1);
            }
            System.out.printf("%d\n", ans);
        }
    }
}
