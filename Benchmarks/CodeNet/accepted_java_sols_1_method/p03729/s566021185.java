import java.util.*;
 
public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[]$) {
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        System.out.println(a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0) ? "YES" : "NO");
    }
}