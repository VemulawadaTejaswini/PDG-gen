import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(scanner.next().matches(String.format("\\d{%d}-\\d{%d}", a, b)) ? "Yes" : "No");
    }
}