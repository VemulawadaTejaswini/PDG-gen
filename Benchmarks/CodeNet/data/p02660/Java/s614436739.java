import java.util.*;

public class Main {

    private static final int[] lp = new int[1000000 + 1];
    private static final List<Integer> pr = new ArrayList<>();

    static  {
        for (int i = 2; i <= 1000000; ++i) {
            if (lp[i] == 0) {
                lp[i] = i;
                pr.add(i);
            }
            for (int j = 0; j < pr.size() && pr.get(j) <= lp[i] && i*pr.get(j) <= 1000000; ++j) {
                lp[(i * pr.get(j))] = pr.get(j);
            }
        }
    }

    public static void main (String[] args) {

        final Scanner in = new Scanner(System.in);

        long N = in.nextLong();

        final boolean pr = isPrime(N);

        final long B = (long)Math.sqrt(N) + 1;
        long count = 0;

        for (int prime = 2; prime <= Math.min(B, 1000000); ++prime) {
            if (lp[prime] == prime && (N > 0) && (N % prime == 0)) {
                long z = prime;
                while ((N > 0) && (N % z == 0)) {
                    count++;
                    N = N/z;
                    z = z*prime;
                }
            }
        }

        if (pr) { // N is prime!
            count++;
        }
        System.out.println(count);
    }

    private static boolean isPrime(final long N) {
        for (long pr = 2; pr*pr <= N; pr++) {
            if(lp[(int) pr] == pr && (N % pr == 0)) {
                return false;
            }
        }
        return true;
    }
}