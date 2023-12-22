import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 09:50-

            int k = sc.nextInt();
            int x = sc.nextInt();

            for (int i = Math.max(-2_000_000, x - (k - 1)); i <= Math.min(2_000_000, x + (k - 1)); i++) {
                out.println(i);
            }

        }
    }

}
