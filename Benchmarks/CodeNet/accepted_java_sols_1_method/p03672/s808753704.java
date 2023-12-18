import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        if (s.length() % 2 == 1) {
            s += " ";
        }
        for (int i = s.length() - 2; i >= 0; i -= 2) {
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            }
        }
    }
}