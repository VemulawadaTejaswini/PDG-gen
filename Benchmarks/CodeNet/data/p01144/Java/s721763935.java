import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final int n = scanner.nextInt();
            final int m = scanner.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            final int[][] data = new int[n][2];
            for (int i = 0; i < n; i++) {
                data[i][0] = scanner.nextInt();
                data[i][1] = scanner.nextInt();
            }
            Arrays.sort(data, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1] == o2[1] ? 0 : (o1[1] < o2[1] ? 1 : -1);
                }
            });
            int result = 0;
            int i = 0;
            for (int sum = 0; i < n; i++) {
                if (sum + data[i][0] > m) {
                    result += (sum + data[i][0] - m) * data[i][1];
                    break;
                } else {
                    sum += data[i][0];
                }
            }
            for (i++ ; i < n; i++) {
                result += data[i][0] * data[i][1];
            }
            System.out.println(result);
        }
    }

    public static void main(String... args) {
        solve();
    }
}