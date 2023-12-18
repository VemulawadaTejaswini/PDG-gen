import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n, x;

            while (true) {
                int cnt = 0;
                n = sc.nextInt();
                x = sc.nextInt();

                if (n == 0 && x == 0) break;

                for (int i = 1; i <= n; i++) {
                    for (int j = i + 1; j <= n; j++) {
                        for (int k = j + 1; k <= n; k++) {
                            if (i + j + k == x) cnt++;
                        }
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
