import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static final long M = 998_244_353;

    // 13:29-
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            int last = 0;
            int total = 0;
            for (int i = 0; i < 5; i++) {
                int x = sc.nextInt();
                total += (x + 9) / 10 * 10;
                if (x % 10 != 0) last = Math.max(last, 10 - x % 10);
            }

            out.println(total - last);
        }
    }
}
