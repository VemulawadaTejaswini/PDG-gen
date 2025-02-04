import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            if (n == 0 && x == 0) {
                return;
            }

            int cnt = 0;
            for (int i = 1; i <= n; ++i) {
                for (int j = i+1; j <= n; ++j) {
                    for (int k = j+1; k <= n; ++k) {
                        if (i + j + k == x)
                                ++cnt;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}
