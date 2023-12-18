import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] p = new int[N];
        for (int i=0; i<N; i++) {
            p[i] = sc.nextInt();
        }

        System.out.println(solve(N, K, p));
    }

    private static int solve(int N, int K, int[] p) {
        int count = 0;

        Arrays.sort(p);
        for (int i=0; i<K; i++) {
            count += p[i];
        }

        return count;
    }
}