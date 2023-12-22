import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 11:46-

            // 11:54-

            int n = sc.nextInt();
            double[] vs = new double[n];
            for (int i = 0; i < vs.length; i++) vs[i] = sc.nextInt();

            Arrays.sort(vs);

            for (int i = 1; i < n; i++) vs[i] = (vs[i - 1] + vs[i]) / 2.0;

            out.println(vs[n - 1]);
        }
    }

}
