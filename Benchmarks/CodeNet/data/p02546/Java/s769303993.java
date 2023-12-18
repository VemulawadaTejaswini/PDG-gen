import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Stirbul
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        APluralForm solver = new APluralForm();
        solver.solve(1, in, out);
        out.close();
    }

    static class APluralForm {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            String s = in.nextLine();

            if (s.endsWith("s")) {
                s = s.concat("es");

            } else {
                s = s.concat("s");
            }

            out.println(s);
        }

    }

    static class FastReader {
        BufferedReader br;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

