import java.util.Scanner;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        // 葉ではない頂点の最大数
        long[] max = new long[n + 1];
        max[0] = 1 - a[0];
        if (max[0] < 0) {
            System.out.println(-1);
            return;
        }

        long ln = 100000000000000L;
        for (int i = 1; i <= n; i++) {
            max[i] = Math.min(max[i - 1] * 2 - a[i], ln);
            if (max[i] < 0) {
                System.out.println(-1);
                return;
            }
        }

        long ans = a[n];
        long[] b = new long[n + 1];
        b[n] = a[n];
        for (int i = n - 1; i >= 0; i--) {
            b[i] = Math.min(max[i], b[i + 1]) + a[i];
            ans += b[i];
        }

        System.out.println(ans);
    }
}

