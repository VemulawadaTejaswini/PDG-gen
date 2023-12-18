import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static int[] calcPrimes(boolean[] table) {
        Arrays.fill(table, true);
        table[0] = table[1] = false;
        for (int i = 2; i <= Math.sqrt(table.length - 1); i++) {
            if (table[i]) {
                for (int j = i + i; j < table.length; j += i) {
                    table[j] = false;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i]) {
                counter++;
            }
        }
        int[] result = new int[counter];
        int index = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i]) {
                result[index++] = i;
            }
        }
        return result;
    }

    private static void solve() {
        final Scanner scanner = new Scanner(System.in);
        boolean[] table = new boolean[30000 + 1];
        final int[] primes = calcPrimes(table);
        
        while (true) {
            final int t = scanner.nextInt();
            if (t == 0) {
                break;
            }
            int counter = 0;
            for (int i = 0; primes[i] < t; i++) {
                for (int j = i; t - primes[i] - primes[j] >= primes[j]; j++) {
                    if (table[t - primes[i] - primes[j]] &&
                            primes[i] + primes[j] > t - primes[i] - primes[j]) {
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }

    }

    public static void main(String... args) {
        solve();
    }
}