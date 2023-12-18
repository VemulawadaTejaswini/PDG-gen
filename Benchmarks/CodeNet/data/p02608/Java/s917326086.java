import java.util.*;

import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    int[] f = new int[10001];
    int n;

    private void run() {
        n = sc.nextInt();

        f(1, 1, 1);

        for (int i = 1; i <= n; i++) {
            System.out.println(f[i]);
        }
    }

    private void f(int x, int y, int z) {
        if (x < y || y < z) {
            return;
        }
        int res = x * x + y * y + z * z + x * y + y * z + z * x;

        if (res > n) {
            return;
        }

        if (x == y && y == z) {
            f[res] = f[res] + 1;
        } else {
            f[res] = f[res] + 3;
        }

        f(x + 1, y, z);
        f(x, y + 1, z);
        f(x, y, z + 1);
        return;
    }
}
