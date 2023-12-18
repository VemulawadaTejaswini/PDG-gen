import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long a = scanner.nextLong() - 1;
        long b = scanner.nextLong();
        long x = scanner.nextLong();
        System.out.println(a == -1 ? b / x + 1 : b / x - a / x);
    }
}