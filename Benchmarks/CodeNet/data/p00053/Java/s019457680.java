import java.util.*;

class Main {

    static boolean primes [];

    static void makeTable () {

        primes = new boolean [200000];
        
        for(int i = 2; i < 200000; i++) {
            primes[i] = true;
        }

        for(int i = 2; i < 200000; i++) {
            if(primes[i]) {
                for (int n = 2 * i; n < 200000; n += i) primes[n] = false;
            }
        }

    }

    static int solve(int n) {
        int sum = 0;
        int added = 0;
        int i = 2;

        while (added < n) {
            if (primes[i]) {
                sum += i;
                added += 1;
            }
            i += 1;
        }

        return sum;
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        makeTable();

        while(true) {
            int n = sc.nextInt();
            if (n == 0) break;
            else        System.out.println(solve(n));
        }


    }
}