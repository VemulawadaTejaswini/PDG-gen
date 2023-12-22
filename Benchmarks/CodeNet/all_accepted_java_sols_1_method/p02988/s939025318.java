import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = 1; i < n - 1; i++) {
            if ((p[i - 1] > p[i] && p[i] > p[i + 1]) || p[i - 1] < p[i] && p[i] < p[i + 1]) ++cnt;
        }

        System.out.println(cnt);
    }
}
