import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        int i = 0;
        while (A >= B) {
            B = B + B;
            i++;
            if (i == K) {
                System.out.println("No");
                return;
            }
            if (A < B) break;
        }

        while (B >= C) {
            C = C + C;
            i++;
            if (i == K) {
                System.out.println("No");
                return;
            }
            if (B < C) break;
        }
        System.out.println("Yes");
        return;
    }
}