import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        System.out.println(s.substring(0, k - 1) + Character.toLowerCase(s.charAt(k - 1)) + s.substring(k));
    }
}