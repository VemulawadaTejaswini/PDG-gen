import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int x = scanner.nextInt(), y = scanner.nextInt();
        System.out.println(Math.min(Math.abs(x + y) + 1, Math.abs(x - y) + (x < y ? 0 : 2)));
    }
}