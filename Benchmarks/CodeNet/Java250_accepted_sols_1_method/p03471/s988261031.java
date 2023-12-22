import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        long Y = cin.nextLong();

        int x = -1, y = -1, z = -1;

        loop:
        for (int a = 0; a <= N; a++) {
            for (int b = 0; b <= N - a; b++) {
                int c = N - a - b;
                if (10000 * a + 5000 * b + 1000 * c == Y) {
                    x = a;
                    y = b;
                    z = c;
                    break loop;
                }
            }
        }

        System.out.printf("%d %d %d\n", x, y, z);
    }
}