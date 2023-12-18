import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            final String[] names = new String[n];
            final boolean[][] table = new boolean[n][30];
            final int[] sum = new int[30];
            for (int i = 0; i < n; i++) {
                names[i] = scanner.next();
                final int m = scanner.nextInt();
                for (int j = 0; j < m; j++) {
                    final int d = scanner.nextInt();
                    table[i][d] = true;
                    sum[d]++;
                }
            }
            int minimum = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < n; i++) {
                int score = 0;
                for (int j = 0; j < table[i].length; j++) {
                    if (table[i][j]) {
                        score += n - sum[j] + 1;
                    }
                }
                if (score < minimum) {
                    minimum = score;
                    minIndex = i;
                } else if (score == minimum && names[i].compareTo(names[minIndex]) < 0) {
                    minimum = score;
                    minIndex = i;
                }
            }
            System.out.println(String.format("%d %s", minimum, names[minIndex]));
        }
    }

    public static void main(String... args) {
        solve();
    }
}