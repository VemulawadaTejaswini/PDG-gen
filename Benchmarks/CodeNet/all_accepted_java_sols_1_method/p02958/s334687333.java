import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 15:03-

            int n = sc.nextInt();
            int diff = 0;
            for (int i = 1; i <= n; i++) {
                if (sc.nextInt() != i) diff++;
            }

            System.out.println((diff == 2 || diff == 0) ? "YES" : "NO");
        }
    }

}
