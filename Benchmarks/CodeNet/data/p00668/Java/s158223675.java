import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    private static int getIndex(int n, boolean[] dead, int from) {
        int i = from;
        for (int k = 0; k < n; i++) {
            if (!dead[i]) {
                k++;
            }
        }
        return i - 1;
    }

    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final int q = scanner.nextInt();
            final int lim = scanner.nextInt();
            if (q == 0 && lim == 0) {
                break;
            }
            int counter = 0;
            int current = 0;
            int oldest = 0;
            int[] array = new int[q];
            boolean[] dead = new boolean[q];
            final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < q; i++) {
                final int query = scanner.nextInt();
                final int xi = scanner.nextInt();
                switch (query) {
                    case 0:
                        map.put(xi, current);
                        array[current++] = xi;
                        counter++;
                        break;
                    case 1:
                        dead[getIndex(xi, dead, oldest)] = true;
                        counter--;
                        break;
                    case 2:
                        System.out.println(array[getIndex(xi, dead, oldest)]);
                        break;
                    case 3:
                        dead[map.remove(xi)] = true;
                        counter--;
                        break;
                }
                if (counter > lim) {
                    while (dead[oldest]) {
                        oldest++;
                    }
                    dead[oldest++] = true;
                    counter--;
                }
            }
            System.out.println("end");
        }
    }

    public static void main(String... args) {
        solve();
    }
}