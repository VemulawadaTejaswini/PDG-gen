import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/09/29 7:01.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            System.out.println(n * n - a);
        }
    }
}