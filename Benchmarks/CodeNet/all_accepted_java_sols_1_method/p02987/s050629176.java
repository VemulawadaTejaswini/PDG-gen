import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        char[] c = scanner.next().toCharArray();
        Arrays.sort(c);
        System.out.println(c[0] == c[1] && c[2] == c[3] && c[1] != c[3] ? "Yes" : "No");
    }
}