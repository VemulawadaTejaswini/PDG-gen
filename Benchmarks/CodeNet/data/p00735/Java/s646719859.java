import java.util.Scanner;

class Main {
    private static int[] calcMondaySaturdayPrimes(int n) {
        boolean[] table = new boolean[n + 1];
        table[0] = table[1] = true;
        for (int i = 0; ; i++) {
            int x = 7 * i + 1;
            if (x > Math.sqrt(n)) {
                break;
            } else if (!table[x]) {
                for (int j = x + x; j <= n; j += x) {
                    table[j] = true;
                }
            }
            x = 7 * i + 6;
            if (x > Math.sqrt(n)) {
                break;
            } else if (!table[x]) {
                for (int j = x + x; j <= n; j += x) {
                    table[j] = true;
                }
            }
        }

        int counter = 0;
        for (int i = 0; ; i++) {
            int x = 7 * i + 1;
            if (x > n) {
                break;
            } else if (!table[x]) {
                counter++;
            }
            x = 7 * i + 6;
            if (x > n) {
                break;
            } else if (!table[x]) {
                counter++;
            }
        }

        int[] result = new int[counter];
        int index = 0;
        for (int i = 0; ; i++) {
            int x = 7 * i + 1;
            if (x > n) {
                break;
            } else if (!table[x]) {
                result[index++] = x;
            }
            x = 7 * i + 6;
            if (x > n) {
                break;
            } else if (!table[x]) {
                result[index++] = x;
            }
        }
        return result;
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int[] primes = calcMondaySaturdayPrimes(300000);

        while (true) {
            int n = scanner.nextInt();
            if (n == 1) {
               break;
            }

            System.out.print(n + ":");
            for (int i = 0; i < primes.length && primes[i] <= n; i++) {
                if (n % primes[i] == 0) {
                    System.out.print(" " + primes[i]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String... args) {
        solve();
    }
}