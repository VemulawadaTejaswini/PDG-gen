import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        System.out.println(s.replace("o", "").length() < 8 ? "YES" : "NO");
    }
}