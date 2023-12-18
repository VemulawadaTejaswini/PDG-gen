import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/10/25 7:03.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int ans = 0;
            for (int i = 0; i < N; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                ans += (r - l) + 1;
            }
            System.out.println(ans);
        }
    }
}