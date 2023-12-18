import java.util.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int y = cin.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                int k = n - i - j;
                if (10000 * i + 5000 * j + 1000 * k == y) {
                    out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }
        out.println("-1 -1 -1");
    }
}
