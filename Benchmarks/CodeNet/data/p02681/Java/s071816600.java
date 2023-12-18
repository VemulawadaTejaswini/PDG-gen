import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        if (T.substring(0,T.length() - 1).equals(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
