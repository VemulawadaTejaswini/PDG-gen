import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int g = 0;
        if (a >= 1 && b <= 10000 && c >= 1 && c <= 10000) {
            for (int d = 1; d <= c; d++) {
                int e = c / d;
                int f = c % d;

                if (f == 0 && e <= b && e >= a) {
                    g++;

                }
            }
            System.out.println(g);
        }

    }
}