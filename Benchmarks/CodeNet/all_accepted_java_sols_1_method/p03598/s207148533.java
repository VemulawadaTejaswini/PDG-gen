import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/09/29 7:07.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                ans += Math.min(x, k - x);
            }
            System.out.println(ans * 2);
        }
    }
}