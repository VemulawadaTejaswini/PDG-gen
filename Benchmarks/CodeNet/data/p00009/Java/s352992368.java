import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        while (in.hasNextInt()) {
            int max = in.nextInt();
            out.println(getPrimes(max).size());
        }
    }


    public static class PrimeFact {
        private final Long orig;
        private LinkedHashMap<Long, Integer> factorization;

        public PrimeFact(long num) {
            orig = num;
            factorization = factorize(num);
        }

        public PrimeFact(int num) {
            orig = (long) num;
            factorization = factorize(num);
        }

        public List<Long> divisors() {
            return getDivisors(this.factorization);
        }
    }

    private static LinkedHashMap<Long, Integer> factorize(long num) {

        LinkedHashMap<Long, Integer> fact;

        if (num == 1L) return new LinkedHashMap<>();

        long sqrt = (long) Math.floor(Math.sqrt(num));

        for (long p : getPrimes(sqrt)) {
            if (num % p == 0) {
                fact = factorize(num/p);
                if (fact.containsKey(p)) fact.put(p, fact.get(p) + 1);
                else fact.put(p, 1);
                return fact;
            }
        }

        fact = new LinkedHashMap<>();
        fact.put(num, 1);
        return fact;
    }

    private static LinkedList<Long> primes;

    static {
        primes = new LinkedList<>();
        primes.add(2L);
    }

    public static boolean testPrime(long num) {
        int sqrt = (int) Math.floor(Math.sqrt(num));

        for (long p : getPrimes(sqrt)) {
            if (p > sqrt) break;
            if (num % p == 0) return false;
        }

        return true;
    }

    public static List<Long> getPrimes(long min) {

        if (primes.getLast() < min)
            genPrime(min);

        int index = 0;
        for (long p : primes) {
            if (p > min) break;
            index++;
        }

        return primes.subList(0, index);
    }

    private static void genPrime(long min) {
        for (long biggestKnown = primes.getLast() + 1; biggestKnown <= min; biggestKnown++) {
            if (isPrime(biggestKnown)) primes.add(biggestKnown);
        }
    }

    private static boolean isPrime(long num) {
        int sqrt = (int) Math.floor(Math.sqrt(num));

        for (long p : primes) {
            if (p > sqrt) break;
            if (num % p == 0) return false;
        }

        return true;
    }

    // ------------------------
    // Get Divisors List
    // ------------------------

    public static List<Long> getDivisors(HashMap<Long, Integer> fact) {
        List<Long> ret = new ArrayList<>();
        if (fact.isEmpty()) {
            ret.add(1L);
            return ret;
        }

        for (Map.Entry<Long, Integer> e : fact.entrySet()) {
            HashMap<Long, Integer> copy = clone(fact);
            copy.remove(e.getKey());
            List<Long> divs = getDivisors(copy);
            for (long div : divs) {
                for (int i = 0; i <= e.getValue(); i++) {
                    ret.add(div * (long) Math.pow(e.getKey(), i));
                }
            }
            break;
        }
        return ret;
    }

    private static HashMap<Long, Integer> clone(HashMap<Long, Integer> h) {
        HashMap<Long, Integer> ret = new HashMap<>();
        for (Map.Entry<Long, Integer> e : h.entrySet()) {
            ret.put(e.getKey(), e.getValue());
        }
        return ret;
    }

}

