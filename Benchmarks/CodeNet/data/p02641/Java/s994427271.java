import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int N = scanner.nextInt();

        boolean[] pMap = new boolean[100];

        for (int i = 0; i < N; i++) {
            int p = scanner.nextInt();
            pMap[p-1] = true;
        }

        for (int i = 0; i < 100; i++) {
            int idx = X - i - 1;

            if (idx >= 0 && 100 > idx) {
                if (!pMap[idx]) {
                    System.out.println(idx + 1);
                    return;
                }
            }

            idx = X + i - 1;
            if (idx >= 0 && 100 > idx) {
                if (!pMap[idx]) {
                    System.out.println(idx + 1);
                    return;
                }
            }
        }
    }
}
