import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 11:46-

            // 11:46-

            int n = sc.nextInt();
            double sum = 0.0;
            for (int i = 0; i < n; i++) sum += 1 / sc.nextDouble();

            out.println(1 / sum);

        }
    }

}
