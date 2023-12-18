import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    private static void calc(int[] numbers, int i, int n, int[] results) {
        if (i < numbers.length - 1) {
            int a = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int b = numbers[j];
                int c = a - b;
                if (c < 0) {
                    c += n;
                }
                if (c > (n - 1) / 2) {
                    c = n - c;
                }
                results[c]++;
                c = b - a;
                if (c < 0) {
                    c += n;
                }
                if (c > (n - 1) / 2) {
                    c = n - c;
                }
                results[c]++;
            }
            calc(numbers, i + 1, n, results);
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            Set<Integer> numbers = new HashSet<Integer>((n - 1) / 2);
            for (int i = 1; i < n; i++) {
                numbers.add((i * i) % n);
            }
            int[] results = new int[(n - 1) / 2 + 2];
            int[] numbersArray = new int[numbers.size()];
            int index = 0;
            for (int i: numbers.toArray(new Integer[numbers.size()])) {
                numbersArray[index++] = i;
            }
            calc(numbersArray, 0, n, results);
            for (int i = 1; i < (n - 1) / 2 + 1; i++) {
                System.out.println(results[i]);
            }
        }
    }

    public static void main(String... arg) {
        solve();
    }
}