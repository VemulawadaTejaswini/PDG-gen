import java.util.Arrays;
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
        int[] primes = calcPrimes(200000);

        while (true) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            if (n == -1 && p == -1) {
                break;
            }
            for (int i = 0; i < primes.length; i++) {
                if (primes[i] > n) {
                    int[] sum = new int[p * (p + 1) / 2];
                    int index = 0;
                    for (int j = 0; j < p; j++) {
                        for (int k = j; k < p; k++) {
                            sum[index++] = primes[i + j] + primes[i + k];
                        }
                    }
                    Arrays.sort(sum);
                    System.out.println(sum[p - 1]);
                    break;
                }
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}