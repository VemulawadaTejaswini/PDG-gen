import java.util.*;
import java.lang.*;

/**
 * FindingAWord
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        int ans = 0;

        out_of_loop: while (true) {
            String str = sc.next();

            if (str.equals("END_OF_TEXT")) {
                break out_of_loop;
            }

            if (target.equalsIgnoreCase(str)) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
