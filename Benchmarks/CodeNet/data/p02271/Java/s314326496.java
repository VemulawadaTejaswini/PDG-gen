import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; ++i) {
            A[i] = scanner.nextInt();
        }

        int q = scanner.nextInt();

        int[] m = new int[q];
        for (int i = 0; i < q; ++i) {
            m[i] = scanner.nextInt();
        }

        boolean[] ans = new boolean[2001];
        for (int j = 0; j < (1 << n); ++j) {
            int sum = 0;

            for (int k = 0; k < n; ++k) {
                if (((j >> k) & 1) == 1) sum += A[k];
            }

            if (sum <= 2000) ans[sum] = true;
        }

        for (int i = 0; i < q; ++i) {
            System.out.println(ans[m[i]] ? "yes" : "no");
        }
    }
}
