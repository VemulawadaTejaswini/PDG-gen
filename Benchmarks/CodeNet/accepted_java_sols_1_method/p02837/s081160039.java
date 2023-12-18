import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int[] a = new int[n];
        int[][] x = new int[n][];
        int[][] y = new int[n][];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(stdIn.next());
            x[i] = new int[a[i]];
            y[i] = new int[a[i]];
            for (int j = 0; j < a[i]; j++) {
                x[i][j] = Integer.parseInt(stdIn.next());
                y[i][j] = Integer.parseInt(stdIn.next());
            }
        }

        int ans = 0;
        for (int i = 0; i < Math.pow(2, n); i++) {
            boolean ok = true;
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    for (int k = 0; k < a[j]; k++) {
                        if (((i >> x[j][k] - 1) & 1) != y[j][k]) {
                            ok = false;
                        }
                    }
                }
            }
            if (ok) {
                ans = Math.max(ans, Integer.bitCount(i));
            }
        }

        System.out.println(ans);
    }
}