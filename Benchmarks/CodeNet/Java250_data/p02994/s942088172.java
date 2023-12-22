import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 11:32-

            int n = sc.nextInt();
            int l = sc.nextInt();

            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                sum += l + i;
                if (Math.abs(min) > Math.abs(l + i)) min = l + i;
            }

            out.println(sum - min);
        }
    }
}
