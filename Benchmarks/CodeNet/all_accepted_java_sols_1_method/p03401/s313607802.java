import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] values = new int[N+2];

        values[0] = 0;
        values[N+1] = 0;
        for (int i = 0; i < N; i++) {
            values[i + 1] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N+1; i++) {
            int diff = Math.abs(values[i] - values[i+1]);
            sum += diff;
        }

        int[] diffs = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            int minus = Math.abs(values[i - 1] - values[i]) + Math.abs(values[i + 1] - values[i]);
            int plus = Math.abs(values[i - 1] - values[i + 1]);
            diffs[i - 1] = (-1 * minus) + plus;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(sum + diffs[i]);
        }
    }
}