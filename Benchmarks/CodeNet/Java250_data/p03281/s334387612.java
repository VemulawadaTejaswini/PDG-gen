
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        int ans = 0;
        for (int i = 1; i <= n; i += 2) {
            int fact = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    fact++;
                }
            }
            if (fact == 8) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
