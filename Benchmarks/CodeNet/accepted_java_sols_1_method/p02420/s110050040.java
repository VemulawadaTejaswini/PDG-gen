import java.util.*;
import java.lang.*;

/**
 * Shuffle
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out_of_loop: while (true) {
            String str = sc.next();

            if (str.equals("-")) {
                break out_of_loop;
            }

            int m = Integer.parseInt(sc.next());

            for (int i = 0; i < m; i++) {
                int n = Integer.parseInt(sc.next());
                // ここでシャッフル
                str = str.substring(n) + str.substring(0, n);
            }

            System.out.println(str);
        }
    }
}
