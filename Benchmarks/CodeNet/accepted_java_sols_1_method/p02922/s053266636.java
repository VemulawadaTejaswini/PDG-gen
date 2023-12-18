import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 15:34-

            int a = sc.nextInt();
            int b = sc.nextInt();

            int x = 1;
            int cnt = 0;
            while (x < b) {
                x--;
                x += a;
                cnt++;
            }

            out.println(cnt);
        }
    }

}
