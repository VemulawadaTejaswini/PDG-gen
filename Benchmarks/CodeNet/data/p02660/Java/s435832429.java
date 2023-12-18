import java.util.*;

public class Main {

    private static final long[] lp = new long[1000000 + 1];
    private static final List<Long> pr = new ArrayList<>();

    static  {
        for (long i = 2; i <= 1000000; ++i) {
            if (lp[(int) i] == 0) {
                lp[(int) i] = i;
                pr.add(i);
            }
            for (int j = 0; j < pr.size() && pr.get(j) <= lp[(int) i] && i*pr.get(j) <= 1000000; ++j) {
                lp[(int) (i * pr.get(j))] = pr.get(j);
            }
        }
    }

    public static void main (String[] args) {

        final Scanner in = new Scanner(System.in);

        long N = in.nextLong();

        final long B = (long)Math.sqrt(N) + 1;
        long count = 0;

        for (long prime = 2; prime <= Math.min(B, 1000000); ++prime) {
            if (lp[(int) prime] == prime && (N > 0) && (N % prime == 0)) {
                long z = prime;
                while ((N > 0) && (N % z == 0)) {
                    count++;
                    N = N/z;
                    z = z*prime;
                }
            }
        }

        if (count == 0 && N > 1) { // N is prime!
            System.out.println(1);
        } else {
            System.out.println(count);
        }
    }
}