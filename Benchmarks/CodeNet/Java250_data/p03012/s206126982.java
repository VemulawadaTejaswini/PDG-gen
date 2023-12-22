import java.awt.Point;
import java.util.Scanner;

public class Main {

    private static Point NA = new Point(0, 0);

    public static void main(String[] args) {
        int[] vals = input();
        int min = Integer.MAX_VALUE;
        for (int t = 1; t < vals.length; t++) {
            int diff = calc(t, vals);
            if (diff < min) {
                min = diff;
            }
        }
        System.out.println(min);
    }

    private static int calc(int t, int[] vals) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < vals.length; i++) {
            if (i < t) {
                sum1 += vals[i];
            } else {
                sum2 += vals[i];
            }
        }

        return sum1 > sum2 ? sum1 - sum2 : sum2 - sum1;
    }

    private static int[] input() {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int[] vals = new int[N];
            for (int i = 0; i < N; i++) {
                vals[i] = scanner.nextInt();
            }
            return vals;
        }
    }
}
