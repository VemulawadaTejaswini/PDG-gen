import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(a.charAt(0) == b.charAt(2) && a.charAt(1) == b.charAt(1) && a.charAt(2) == b.charAt(0) ? "YES" : "NO");
    }
}