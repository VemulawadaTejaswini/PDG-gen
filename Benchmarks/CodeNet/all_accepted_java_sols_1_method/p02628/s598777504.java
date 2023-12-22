import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] p = new int[N];

        for (int i = 0; i < N; i++) {
            p[i] = scanner.nextInt();
        }

        Arrays.sort(p);

        int ans = 0;

        for (int i = 0; i < K; i++) {
            ans += p[i];
        }

        System.out.println(ans);
    }
}
