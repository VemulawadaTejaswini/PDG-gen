import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            String line;
            line = br.readLine();
            st = new StringTokenizer(line);
            long m = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            long r = 1;
            ArrayDeque<Long> deque = new ArrayDeque<>(factorize(n));
            for (Long aLong : deque) {
                r = 1;
                for (long i = 0; i < aLong; i++) {
                    r = r * m;
                    if (r >= 1000000007) {
                        r = r % 1000000007;
                    }
                }
                m = r;
            }
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static ArrayDeque<Long> factorize(long n) {
        ArrayDeque<Long> deque = new ArrayDeque<>();
        return factorize(deque, n, 3);
    }

    private static ArrayDeque<Long> factorize(ArrayDeque<Long> deque, long n, long r) {
        if (n == 1) {
            return deque;
        } else if (isPrime(n)) {
            deque.add(n);
            return deque;
        } else if (n % 2 == 0) {
            deque.add((long)2);
            n = n / (long) 2;
            factorize(deque, n, r);
        } else {
            for (long i = r; i <= n; i += 2) {
                if (n % i == 0) {
                    r = i;
                    deque.add(i);
                    n = n / i;
                    factorize(deque, n, r);
                    break;
                }
            }
        }
        return deque;
    }

    private static boolean isPrime(long n) {
        if (n == 2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }

        int i = 3;
        while (i <= Math.sqrt((double) n)) {
            if (n % i == 0) {
                return false;
            }
            i = i + 2;
        }
        return true;
    }
}