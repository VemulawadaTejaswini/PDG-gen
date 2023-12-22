import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String[] xx = x.split("");


        String check_char_one = new String();
        String check_char_two = new String();

        for (int i = 0; i < xx.length / 2; i++) {
            check_char_one += xx[i];
        }

        for (int i = ((xx.length + 3 ) / 2 -1); i < xx.length; i++) {
            check_char_two += xx[i];
        }

        if (check_char_one.equals(check_char_two)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}