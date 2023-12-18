import java.util.Scanner;

class Main {
    private static int[] rec(int i, int[][] treasure, int limit) {
        if (i == treasure.length) {
            int[] result = new int[2];
            result[0] = 0;
            result[1] = limit;
            return result;
        } else if (limit < treasure[i][1]) {
            return rec(i + 1, treasure, limit);
        } else {
            int[] a = rec(i + 1, treasure, limit - treasure[i][1]);
            int[] b = rec(i + 1, treasure, limit);
            a[0] += treasure[i][0];
            if (a[0] > b[0]) {
                return a;
            } else if (a[0] < b[0]) {
                return b;
            } else if (a[1] > b[1]) {
                return a;
            } else {
                return b;
            }
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in).useDelimiter("[,\\s]+");

        for (int i = 0; ; i++) {
            int maximum = scanner.nextInt();
            if (maximum == 0) {
                break;
            }
            int n = scanner.nextInt();
            int[][] treasure = new int[n][2];
            for (int j = 0; j < n; j++) {
                treasure[j][0] = scanner.nextInt();
                treasure[j][1] = scanner.nextInt();
            }
            int[] result = rec(0, treasure, maximum);
            System.out.println("Case " + (i + 1) + ":");
            System.out.println(result[0]);
            System.out.println(maximum - result[1]);
        }
    }

    public static void main(String... args) {
        solve();
    }
}