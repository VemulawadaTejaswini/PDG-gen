import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long a = 1;
        long b = 1;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            long c1 = (a + x - 1) / x;
            long c2 = (b + y - 1) / y;

            long max = Math.max(c1, c2);

            a = x * max;
            b = y * max;
        }

        System.out.println(a + b);
    }
}
