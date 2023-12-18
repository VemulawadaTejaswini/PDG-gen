import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(a <= 0 && 0 <= b ? "Zero" : b < 0 && Math.abs(a - b) % 2 == 0 ? "Negative" : "Positive");
    }
}