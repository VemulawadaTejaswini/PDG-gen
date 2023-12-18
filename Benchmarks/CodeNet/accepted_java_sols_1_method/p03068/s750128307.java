import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        String s = scanner.next();
        char k = s.charAt(scanner.nextInt() - 1);
        System.out.println(s.replaceAll("[^" + k + "]", "*"));
    }
}