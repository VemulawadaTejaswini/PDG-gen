import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (;;) {
            if (y > x) {
                x = x ^ y;
                y = x ^ y;
                x = x ^ y;
            }
            if (y == 0) {
                System.out.println(x);
                return;
            }
            x -= y;
        }
    }
}

