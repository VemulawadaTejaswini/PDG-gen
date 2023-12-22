
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String n = sc.next();
        sc.close();
        String result = "hon";
        int tmp = Integer.parseInt(n.split("")[n.length() - 1]);
        if (tmp == 3) {
            result = "bon";
        } else if (tmp == 0 || tmp == 1 || tmp == 6 || tmp == 8) {
            result = "pon";
        }

        System.out.println(result);
    }
}