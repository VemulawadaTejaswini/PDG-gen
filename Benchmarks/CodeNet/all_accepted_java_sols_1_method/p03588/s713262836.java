import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/09/30 21:10.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int minA = -1;
            int minB = Integer.MAX_VALUE;

            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (minB > b) {
                    minA = a;
                    minB = b;
                }
            }
            System.out.println(minA + minB);
        }
    }
}