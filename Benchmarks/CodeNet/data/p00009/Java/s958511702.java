import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        boolean [] primes = new boolean[1000000];
        for (int n = 0; n < 1000000; n++) {
            primes[n] = true;
        }
        primes[0] = false;
        primes[1] = false;

        for (int n = 0; n < 1000000; n++) {
            if (primes[n]) {
                for (int k = 2*n; k < 1000000; k+=n) {
                    primes[k] = false;
                }
            }
        }

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int result = 0;
            for (int k = 0; k <= n; k++) {
                if (primes[k]) result += 1;
            }
            System.out.println(result);
        }

    }
}