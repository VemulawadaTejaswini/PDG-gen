import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Y = sc.nextInt();

        // 1000, 5000, 10000 yen

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                int k = N - i - j;

                if (1000 * i + 5000 * j + 10000 * k == Y) {
                    System.out.println(String.format("%d %d %d", k, j, i));
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}