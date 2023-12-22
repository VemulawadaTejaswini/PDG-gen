import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean isBad = false;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) isBad = true;
        }
        if (isBad) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}
