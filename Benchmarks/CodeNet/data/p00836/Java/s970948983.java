import java.util.Scanner;

class Main {
    private static int[] calcPrimes(int n) {
        boolean[] table = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!table[i]) {
                for (int j = i + i; j <= n; j += i) {
                    table[j] = true;
                }
            }
        }
        int counter = 0;
        for (int i = 2; i <= n; i++) {
            if (!table[i]) {
                counter++;
            }
        }
        int[] result = new int[counter];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (!table[i]) {
                result[index++] = i;
            }
        }
        return result;
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int[] primes = calcPrimes(10000 + 100);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int counter = 0;
            for (int i = 0; i < primes.length && primes[i] <= n; i++) {
                int x = n;
                for (int j = 0; x > 0; j++) {
                    x -= primes[i + j];
                }
                if (x == 0) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }

    public static void main(String... args) {
        solve();
    }
}