import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MAX = 1000 * 1000;

    public static void main(String[] args) throws java.io.IOException {
        boolean[] prime = new boolean[MAX + 1];
        Scanner sc = new Scanner(System.in);
        prime[1] = true;
        prime[2] = true;
        prime[3] = true;
        prime[5] = true;
        for (int i = 2; i <= 5; i++) {
            if (prime[i]) {
                for (int j = 2; j <= MAX / i; j++) {
                    if (prime[j]) {
                        prime[i * j] = true;
                    }
                }
            }
        }
        while (true) {
            int m = sc.nextInt();
            if (m == 0)
                break;
            int n = sc.nextInt();
            int ans = 0;
            for (int i = m; i <= n; i++) {
                if (prime[i])
                    ans++;
            }
            System.out.println(ans);
        }

    }
}