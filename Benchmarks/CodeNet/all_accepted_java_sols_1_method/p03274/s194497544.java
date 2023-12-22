import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long x[] = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }
        long cost[] = new long[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            long left = x[i];
            long right = x[i + k - 1];
            if (left < 0) {
                if (right < 0) {
                    cost[i] = left * -1;
                    continue;
                } else {
                    cost[i] = right + (left * -1) + Math.min(right, (left * -1));
                    continue;
                }
            } else {
                cost[i] = right;
            }
        }
        Arrays.sort(cost);
        System.out.println(cost[0]);

        sc.close();
    }
}
