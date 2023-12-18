import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();

        for (int a = 0; a <= n; a++) {
            for (int b = 0; b <= n; b++) {
                if (n - a - b < 0) {
                    continue;
                }

                if (10000 * a + 5000 * b + 1000 * (n - a - b) == y) {
                    System.out.println(
                            String.format("%d %d %d", a, b, (n - a - b))
                    );
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}

