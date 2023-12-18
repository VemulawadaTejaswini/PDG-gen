import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        Arrays.sort(H);
        long ans = 0;
        for (int i = 0; i < N-K; i++) {
            ans += H[i];
        }

        System.out.println(ans);
    }
}
