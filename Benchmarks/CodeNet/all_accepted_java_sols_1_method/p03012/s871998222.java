import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 10:36-

            int n = sc.nextInt();
            int[] ws = new int[n];
            for (int i = 0; i < ws.length; i++) ws[i] = sc.nextInt();

            int[] p1 = new int[n];
            int[] p2 = new int[n];
            for (int i = 0; i < ws.length; i++) {
                p1[i] += ws[i];
                if (i > 0) p1[i] += p1[i - 1];
            }

            for (int i = ws.length - 1; i >= 0; i--) {
                p2[i] += ws[i];
                if (i < ws.length - 1) p2[i] += p2[i + 1];
            }

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < ws.length - 1; i++) {
                min = Math.min(min, Math.abs(p1[i] - p2[i + 1]));
            }

            out.println(min);
        }
    }
}
