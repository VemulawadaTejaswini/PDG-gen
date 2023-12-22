import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int[] bs = new int[m];
        for (int i = 0; i < m; i++) {
            bs[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tmp = c;
            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                tmp += bs[j] * a;
            }

            if (tmp > 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
