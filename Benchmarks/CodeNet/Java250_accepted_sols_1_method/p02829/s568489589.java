import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st;
                PrintWriter pw = new PrintWriter(System.out);

                int a = Integer.parseInt(br.readLine());
                int b = Integer.parseInt(br.readLine());
                int x = 1^2^3;
                x^=a;
                x^=b;
                pw.println(x);


                pw.flush();
                pw.close();
        }
}
