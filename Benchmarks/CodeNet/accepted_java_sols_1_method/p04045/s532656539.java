

import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2018/03/02 19:31.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String notUse = "";
            for (int i = 0; i < K; i++) {
                notUse += sc.next();
            }
            int ans = -1;
            for (int i = 0; i <= N * 10; i++) {
                if (i < N) {
                    continue;
                }
                boolean yes = true;
                for (char ch : Integer.toString(i).toCharArray()) {
                    if (notUse.contains("" + ch)) {
                        yes = false;
                        break;
                    }
                }
                if (yes) {
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }

}
