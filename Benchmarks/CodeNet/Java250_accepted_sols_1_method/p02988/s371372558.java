import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 11:09-

            int n = sc.nextInt();
            int[] vs = new int[n];

            for (int i = 0; i < vs.length; i++) vs[i] = sc.nextInt();

            int cnt = 0;
            for (int i = 1; i < n - 1; i++) {
                if (vs[i] > vs[i - 1] && vs[i] < vs[i + 1] ||
                        vs[i] < vs[i - 1] && vs[i] > vs[i + 1]) {
                    cnt++;
                }
            }

            out.println(cnt);
        }
    }
}
