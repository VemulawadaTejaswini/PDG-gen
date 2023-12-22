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
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CColoringColorfully solver = new CColoringColorfully();
        solver.solve(1, in, out);
        out.close();
    }

    static class CColoringColorfully {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            String s = sc.nextLine();
            int nb0 = 0;
            int nb1 = 0;
            int tawa1 = 0;
            int tawa2 = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - '0' != tawa1) {
                    nb0++;
                }
                if (s.charAt(i) - '0' != tawa2) {
                    nb1++;
                }
                tawa1 = (tawa1 + 1) % 2;
                tawa2 = (tawa2 + 1) % 2;
            }
            out.println(Math.min(nb0, nb1));
        }

    }

    static class inputClass {
        BufferedReader br;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
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

