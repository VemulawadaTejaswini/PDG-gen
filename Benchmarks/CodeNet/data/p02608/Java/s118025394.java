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

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                for (int k = 1; k <= 100; k++) {
                    int res = i * i + j * j + k * k + i * j + j * k + k * i;
                    if (res <= n) {
                        f[res]++;
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(f[i]);
        }
    }
}
