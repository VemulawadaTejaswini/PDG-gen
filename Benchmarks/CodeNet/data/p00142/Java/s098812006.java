import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            Set<Integer> numbers = new HashSet<Integer>();
            for (int i = 1; i < n; i++) {
                numbers.add((i * i) % n);
            }

            int[] results = new int[(n - 1) / 2 + 1];
            int[] numbersArray = new int[numbers.size()];
            int index = 0;
            for (int i: numbers.toArray(new Integer[numbers.size()])) {
                numbersArray[index++] = i;
            }

            for (int i = 0; i < numbersArray.length; i++) {
                int a = numbersArray[i];
                for (int j = 0; j < numbersArray.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    int b = numbersArray[j];
                    int c = a - b;
                    if (c < 0) {
                        c += n;
                    }
                    if (c > (n - 1) / 2) {
                        c = n - c;
                    }
                    results[c]++;
                }
            }
            for (int i = 1; i < (n - 1) / 2 + 1; i++) {
                System.out.println(results[i]);
            }
        }
    }

    public static void main(String... arg) {
        solve();
    }
}