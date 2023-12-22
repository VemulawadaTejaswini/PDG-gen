import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long MOD = 998244353;

    public static void main(String[] args) {
        int N = sc.nextInt();
        if (sc.nextInt() != 0) {
            System.out.println(0);
            return;
        }
        int max = 0;
        int[] count = new int[N];
        for (int i = 1; i < N; i++) {
            int d = sc.nextInt();
            count[d]++;
            max = Math.max(max, d);
        }
        if (count[0] != 0) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 2; i <= max; i++) {
            for (int j = 0; j < count[i]; j++) {
                ans *= count[i - 1];
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }

}
