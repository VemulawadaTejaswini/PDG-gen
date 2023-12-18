import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++)
            D[i] = sc.nextInt();
        int[] count = new int[N];
        long ans = 1;
        boolean isPrevZero = false;

        for (int i = 0; i < N; i++)
            count[D[i]]++;

        if (D[0] != 0 || count[0] != 1) {
            System.out.println(0);
            return;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < count[i]; j++) {
                ans *= count[i - 1];
                ans %= 998244353;
            }
        }

        System.out.println(ans % 998244353);

    }
}