import java.util.*;
import java.util.stream.Stream;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            l = Math.min(l, x[i]);
            r = Math.max(r, x[i]);
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            int cost = calc(i, x);
            if (cost < minCost) {
                minCost = cost;
            }
        }
        System.out.println(minCost);
    }

    private int calc(int i, int[] x) {
        int cost = 0;
        for (int j = 0; j < x.length; j++) {
            cost += Math.pow(x[j] - i, 2);
        }
        return cost;
    }
}
