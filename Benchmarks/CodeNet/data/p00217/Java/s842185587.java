
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n > 0) {
            int x = 0;
            int y = 0;
            int z = 0;
            int p[] = new int[n];
            int d[] = new int[n];
            int e[] = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = scanner.nextInt();
                d[i] = scanner.nextInt();
                e[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                x = d[i] + e[i];
                if (y < x) {
                    y = x;
                    z = p[i];
                }

            }

            System.out.print(z+" ");
            System.out.println(y);

            n = scanner.nextInt();

        }
    }
}

