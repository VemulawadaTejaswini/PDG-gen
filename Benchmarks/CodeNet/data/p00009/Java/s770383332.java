import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static HashMap<Integer, Boolean> isPrimes;

    static {
        isPrimes = new HashMap<Integer, Boolean>();
    }

    public static int countPrimes(int last) {
        int nPrimes = 0;
        if (last < 2) {
            nPrimes = 0;
        } else if (last == 2) {
            nPrimes = 1;
        } else {
            nPrimes = 1;
            for (int x = 3; x <= last; x += 2) {
                Boolean isPrimeCache = isPrimes.get(x);
                if (isPrimeCache != null) {
                    if (isPrimeCache.booleanValue()) {
                        nPrimes++;
                    }
                    continue;
                }

                boolean isPrime = true;
                for (int y = 2; y < x / 2; y++) {
                    if (x % y == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    nPrimes++;
                }
                isPrimes.put(x, isPrime);
            }
        }
        return nPrimes;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int nPrimes = countPrimes(n);
            System.out.println(nPrimes);
        }
    }
}