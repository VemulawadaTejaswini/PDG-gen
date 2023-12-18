import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 15:06-

            int n = sc.nextInt();
            int[] as = new int[n + 1];
            for (int i = 0; i < as.length; i++) as[i] = sc.nextInt();

            int[] vs = new int[n];
            for (int i = 0; i < vs.length; i++) vs[i] = sc.nextInt();

            long killed = 0;
            for (int i = vs.length - 1; i >= 0; i--) {
                for (int j = 1; j >= 0; j--) {
                    int a = as[i + j];
                    int v = vs[i];

                    int m = Math.min(v, a);
                    killed += m;
                    vs[i] -= m;
                    as[i + j] -= m;
                }
            }
            
            out.println(killed);
        }
    }

}
