import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    void solve() {
        // Input
        int n = sc.nextInt();
        int[] R = new int[n];
        for (int i = 0; i < n; i++) {
            R[i] = sc.nextInt();
        }

        // Solve
        int[] max = new int[n - 1];
        max[n - 2] = R[n - 2 + 1];
        for (int i = n - 3; i >= 0; i--) {
            max[i] = Math.max(max[i + 1], R[i + 1]);
        }
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            maximum = Math.max(maximum, max[i] - R[i]);
        }

        // Output
        System.out.println(maximum);

    }

    public static void main(String[] args) {
        new Main().solve();
    }
}

