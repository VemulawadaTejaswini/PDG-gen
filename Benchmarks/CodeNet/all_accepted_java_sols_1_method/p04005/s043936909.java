import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        System.out.println(a % 2 + b % 2 + c % 2 == 3 ? Math.min(Math.min(a * b, b * c), c * a) : 0);
    }
}