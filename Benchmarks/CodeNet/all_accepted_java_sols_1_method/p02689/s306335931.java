import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static final int MAXN = 100001;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n, m;
        var h = new int[MAXN];
        var paths = new ArrayList<ArrayList<Integer>>();

        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            h[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            paths.add(new ArrayList<>());
        }
        for (int i = 0; i < m; ++i) {
            int a = scanner.nextInt() - 1, b = scanner.nextInt() - 1;
            paths.get(a).add(b);
            paths.get(b).add(a);
        }

        int count = 0;
        for (int i = 0; i < n; ++i) {
            boolean flag = true;
            for (Integer j: paths.get(i)) {
                if (h[j] >= h[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }

        System.out.println(count);
    }
}
